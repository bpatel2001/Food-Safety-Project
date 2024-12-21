package com.gfsiproject.gfsi.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gfsiproject.gfsi.entity.Country;

@Repository
public interface CountryService {
    public List<Country> getCountryData();
    public Country getCountryByName(String countryName);
}
