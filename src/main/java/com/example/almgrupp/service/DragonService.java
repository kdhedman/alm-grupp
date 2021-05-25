package com.example.almgrupp.service;

import com.example.almgrupp.Repositories.DragonRepository;
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
        return repository.getAll();
    }
    public void saveNewDragon(Dragon dragon) {
        repository.save(dragon);
    }
    public List<String> getDragonByColor(color) {
        List<Dragon> dragonsResult = repository.findDragonsByColor(color);
        return dragonsResult.stream().map(dragon -> dragon.getColor()).collect(Collectors.toList());
    }
}
