package com.example.almgrupp.repositories;

import com.example.almgrupp.models.Dragon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DragonRepository extends MongoRepository<Dragon, String> {
    List<Dragon> findDragonsByColor(String color);
    Dragon findByName(String name);
}