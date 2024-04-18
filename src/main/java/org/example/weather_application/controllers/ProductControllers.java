package org.example.weather_application.controllers;

import org.example.weather_application.Model.Product;
import org.example.weather_application.dtos.ProductDtos;

import org.example.weather_application.services.ProductServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductControllers {

    //Creating constructor for ProductServices

    public ProductServices productService;
    public ProductControllers(ProductServices productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ProductDtos getProductById(@PathVariable("id") Long id ){
//        System.out.println("get method "+product.getName());
        return productService.getProductDtos(id);
    }

    //RequestBody is used to convert json value to java objects
    @ResponseBody
    @PostMapping("")
    public Product createProduct(@RequestBody Product product){
        System.out.println("nammemee "+product.getName());
        return product ;
    }

}
