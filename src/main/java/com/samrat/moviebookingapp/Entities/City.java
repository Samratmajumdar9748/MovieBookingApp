package com.samrat.moviebookingapp.Entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "city_id",nullable = false)
    private int cityId;
    @Column(name = "city_name",nullable = false)
    private String cityName;

    @Column
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "" )
    private Set<Theatre> theatreSet;

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
