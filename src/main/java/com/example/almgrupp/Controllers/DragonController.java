package com.example.almgrupp.Controllers;

import com.example.almgrupp.service.DragonService;
import lombok.RequiredArgsConstructor;

import java.util.List;


import com.example.almgrupp.models.Dragon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class DragonController {
    private final DragonService service;

        @GetMapping("/dragons")
        public List<Dragon> getdragons() {
            return service.getDragons();
        }

        @PostMapping("/dragons")
        public void saveNewdragon(@RequestBody Dragon dragon) {
            service.saveNewDragon(dragon);
        }

}

