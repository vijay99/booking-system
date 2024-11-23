package com.booking.system.controller;


import com.booking.system.entity.Show;
import com.booking.system.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;


@RestController
public class ShowController {
    @Autowired
    private ShowService showService;



    @GetMapping("/shows")
    public CompletableFuture<List<Show>> getAllShows() {
        return showService.getAllShowsAsync();
    }
}

