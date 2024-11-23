package com.booking.system.controller;


import com.booking.system.model.TicketBookingRequest;
import com.booking.system.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping("/book")
    public String bookTickets(@RequestBody TicketBookingRequest request) {
        ticketService.bookTickets(request);
        return "Booking in progress. You'll receive a confirmation soon.";
    }
}

