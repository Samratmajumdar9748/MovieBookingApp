package com.samrat.moviebookingapp.Dao;

import com.samrat.moviebookingapp.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {

    City findCityByCityId(int cityId);

    City findCityByCityName(String cityName);

}
