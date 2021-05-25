package com.example.almgrupp.Repositories;

import com.example.almgrupp.models.Dragon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DragonRepository extends MongoRepository<Dragon, String> {



}