package org.example.weather_application.controllers;

import org.example.weather_application.Model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductControllers {
    String result = "Product Created";

    @GetMapping("/{id}/{temp}")
    public String getProductById(@PathVariable("id") Long id, @PathVariable("temp") String temp ){
//        System.out.println("get method "+product.getName());
        return "this is your id " + id +" "+ temp;
    }

    //RequestBody is used to convert json value to java objects
    @PostMapping("")
    public String createProduct(@RequestBody Product product){
        System.out.println("nammemee "+product.getName());
        return result ;
    }

}
