package com.gfsiproject.gfsi.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gfsiproject.gfsi.entity.Country;
import com.gfsiproject.gfsi.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryservice;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/countries")
    public List<Country> getCountries(){
        return this.countryservice.getCountryData();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/countries/{country_name}")
    @SuppressWarnings("CallToPrintStackTrace")
    public Country getCountriesByName(@PathVariable String country_name){
        try { 
            country_name = URLDecoder.decode(country_name, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return this.countryservice.getCountryByName(country_name);
    }
}
