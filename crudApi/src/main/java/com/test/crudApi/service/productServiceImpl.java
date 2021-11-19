package com.test.crudApi.service;

import org.springframework.stereotype.Service;

@Service
public class productServiceImpl implements IproductService {

    @Override
    public Double getTotalPrice(Double price1, Double price2) {
        return price1 + price2;
    }

}
