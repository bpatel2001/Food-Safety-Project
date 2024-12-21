package com.gfsiproject.gfsi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gfsiproject.gfsi.entity.Country;
import com.gfsiproject.gfsi.service.CountryService;


@RestController
public class CountryController {

    @Autowired
    private CountryService countryservice;

    @GetMapping("/countries")
    public List<Country> getCountries(){
        return this.countryservice.getCountryData();
    }

    @GetMapping("/countries/{country_name}")
    public Country getCountriesByName(@PathVariable String country_name){
        return this.countryservice.getCountryByName(country_name);
    }
}
