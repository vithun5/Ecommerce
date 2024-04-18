package org.example.weather_application.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private String imageUrl;
    private String description;
    private double price;

}