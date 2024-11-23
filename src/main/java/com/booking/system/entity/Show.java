package com.booking.system.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "shows")
public class Show {
    @Id
    private String id;
    private String movieName;
    private String theater;
    private int availableSeats;
    private String timing;
}

