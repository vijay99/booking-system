package com.booking.system.service;

import com.booking.system.entity.Show;
import com.booking.system.exception.BookingException;
import com.booking.system.model.TicketBookingRequest;
import com.booking.system.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketService {
    @Autowired
    private ShowRepository showRepository;
    private final Lock lock = new ReentrantLock();

    @Async
    public void bookTickets(TicketBookingRequest request){
        lock.lock(); // Acquiring the lock
        try {
            // Critical Section
            Show show = showRepository.findById(request.getShowId())
                    .orElseThrow(() -> new BookingException("Show not found!"));

            if (show.getAvailableSeats() < request.getSeatsToBook()) {
                throw new BookingException("Not enough seats available");
            }
            // Update the available seats
            show.setAvailableSeats(show.getAvailableSeats() - request.getSeatsToBook());
            showRepository.save(show);
            System.out.println("Booking Successful for User: " + request.getUserId());
        }
        finally {
            lock.unlock();  // Releasing the lock
        }

    }

}
