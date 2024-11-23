package com.booking.system.service;

import com.booking.system.entity.Show;
import com.booking.system.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.messaging.Task;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class ShowService {
    @Autowired
    private ShowRepository showRepository;


   @Async
    public CompletableFuture<List<Show>> getAllShowsAsync(){
        return CompletableFuture.supplyAsync(() ->showRepository.findAll());
    }
}
