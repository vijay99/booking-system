package com.booking.system.repository;

import com.booking.system.entity.Show;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShowRepository extends MongoRepository<Show, String> {
}

