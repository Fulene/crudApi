package com.test.crudApi.controller;

import com.test.crudApi.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogueRestController {

    @Autowired
    private IproductService productService;

    @GetMapping("/test")
    public String getTotalPrice() {
        return "Mon test";
    }

    @GetMapping("/total")
    public Double getTotalPrice(@RequestParam("p1") Double price1, @RequestParam("p2") Double price2) {
        return productService.getTotalPrice(price1, price2);
    }

}
