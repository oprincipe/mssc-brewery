package com.oprincipe.msscbrewery.services;

import com.oprincipe.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Test beer")
                .beerStyle("Pale Ale")
                .build();
    }
}
