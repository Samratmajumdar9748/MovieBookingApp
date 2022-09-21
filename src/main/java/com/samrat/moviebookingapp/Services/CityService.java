package com.samrat.moviebookingapp.Services;

import com.samrat.moviebookingapp.Entities.City;

import java.util.List;

public interface CityService {

    City acceptCityDetails(City city);
    City updateCityDetails(int id, City city);
    City getCityDetails(int id);
    City getCityDetailsByCityName(String cityName);
    boolean deleteCity(int id);
    List<City> getAllCityDetails();
}
