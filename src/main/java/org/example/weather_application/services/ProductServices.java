package org.example.weather_application.services;

import org.example.weather_application.dtos.ProductDtos;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {

    public ProductDtos getProductDtos(Long id) {

        // Call DB here
        ProductDtos obj = new ProductDtos();
        obj.setId(1);
        obj.setName("vithun");
        obj.setImageUrl("www.apple.com");
        return obj;

    }
}
