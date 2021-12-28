package com.oprincipe.msscbrewery.services;

import com.oprincipe.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
