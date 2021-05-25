package com.example.almgrupp.service;

import com.example.almgrupp.models.Dragon;
import com.example.almgrupp.repositories.DragonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DragonServiceTest {

    DragonService dragonService;

    @Mock
    DragonRepository mockRepository;

    @BeforeEach
    public void init(){
        dragonService = new DragonService(mockRepository);
    }

    @Test
    void getDragons(){
        String expectedName = "Smaug";
        String expectedSize = "Large";
        Dragon mockDragon = new Dragon(null, expectedName, expectedSize, 800, 6.0, "Green");

        when(mockRepository.findAll())
                .thenReturn(Arrays.asList(mockDragon));

        List<Dragon> actual = dragonService.getDragons();

        System.out.println("ID: " + actual.get(0).getId());
        assertEquals(expectedName, actual.get(0).getName());
        assertEquals(expectedSize, actual.get(0).getSize());
    }
}