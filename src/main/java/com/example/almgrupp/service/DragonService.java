package com.example.almgrupp.service;

import com.example.almgrupp.repositories.DragonRepository;
import com.example.almgrupp.models.Dragon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class DragonService {
    private final DragonRepository repository;

    public List<Dragon> getDragons() {
        return repository.findAll();
    }

    public void saveNewDragon(Dragon dragon) {
        repository.save(dragon);
    }
    public List<Dragon> getDragonByColor(String color) {
        return repository.findDragonsByColor(color);
    }
    public List<String> getAllColors(){
        List<Dragon> dragonsResult = repository.findAll();
        return dragonsResult.stream().map(dragon -> dragon.getColor()).collect(Collectors.toList());
    }

    public List<String> getAllNames() {
        List<Dragon> dragonsResult = repository.findAll();
        return dragonsResult.stream().map(dragon -> dragon.getName()).collect(Collectors.toList());
    }
    public Dragon getDragonByName(String name){
        return repository.findByName(name);
    }
}