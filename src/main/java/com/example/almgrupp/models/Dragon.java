package com.example.almgrupp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dragon {
    String id;
    String name;
    String size;
    int age;
    double challengeRating;
    String color;
}
