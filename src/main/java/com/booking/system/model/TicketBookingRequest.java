package com.booking.system.model;

import lombok.Data;

@Data
public class TicketBookingRequest {
    private String userId;
    private String showId;
    private int seatsToBook;
}

