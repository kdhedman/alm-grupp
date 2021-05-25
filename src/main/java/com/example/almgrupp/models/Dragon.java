package com.example.almgrupp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dragon {
    String name;
    String size;
    int age;
    String challengeRating;
    String color;
}
