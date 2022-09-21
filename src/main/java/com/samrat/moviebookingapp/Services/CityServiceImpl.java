package com.samrat.moviebookingapp.Services;

import com.samrat.moviebookingapp.Dao.CityDao;
import com.samrat.moviebookingapp.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CityServiceImpl implements CityService{

    CityDao cityDao;

    CityServiceImpl(CityDao cityDao){
        this.cityDao=cityDao;
    }

    @Override
    public City acceptCityDetails(City city) {
        return cityDao.save(city);
    }

    @Override
    public City updateCityDetails(int id, City city) {
        City foundCity= getCityDetails(id);
        foundCity.setCityName(city.getCityName());
        foundCity.setTheatreSet(city.getTheatreSet());
        return cityDao.save(foundCity);
    }

    @Override
    public City getCityDetails(int id) {
        return cityDao.findCityByCityId(id);
    }

    @Override
    public City getCityDetailsByCityName(String cityName) {
        return cityDao.findCityByCityName(cityName);
    }

    @Override
    public boolean deleteCity(int id) {
        City ifCity= getCityDetails(id);
        if (ifCity!=null){
            cityDao.delete(ifCity);
            return true;
        }
        else
            return false;
    }

    @Override
    public List<City> getAllCityDetails() {
        return cityDao.findAll();
    }
}
