package com.gfsiproject.gfsi.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfsiproject.gfsi.DBConnection.DBConnection;
import com.gfsiproject.gfsi.entity.Country;

@Service
public class CountryServiceImpl implements CountryService {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Autowired
    static List<Country> countrylist = new ArrayList();

    Connection connection;

    public CountryServiceImpl() throws SQLException {
        connection = DBConnection.getDBConnection();
    }

    @Override
    @SuppressWarnings("CallToPrintStackTrace")
    public List<Country> getCountryData() {
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM COUNTRIES");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Country country = new Country();
                country.setCountry(rs.getString(1));
                country.setOverall(rs.getDouble(2));
                country.setAffordability(rs.getDouble(3));
                country.setAvailability(rs.getDouble(4));
                country.setQuality(rs.getDouble(5));
                country.setSustainability(rs.getDouble(6));
                country.setOverallrank(rs.getInt(7));
                country.setAffordabilityrank(rs.getInt(8));
                country.setAvailabilityrank(rs.getInt(9));
                country.setQualityrank(rs.getInt(10));
                country.setSustainabilityrank(rs.getInt(11));
                countrylist.add(country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countrylist;
    }
}
