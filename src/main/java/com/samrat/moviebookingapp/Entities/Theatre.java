package com.samrat.moviebookingapp.Entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "theatre")
public class Theatre {
    @Id
    @Column(name = "theatre_id")
    private int theatreId;
    @Column(name = "theatre_name",nullable = false)
    private String theatreName;

    @ManyToOne
    @JoinColumn(name = "city_id",nullable = false)
    private City city;

    @Column(name = "ticket_price",nullable = false)
    private float ticketPrice=150.00f;

    @ManyToMany(mappedBy = "theatreSet")
    private Set<Movie> movieSet;
    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId=" + theatreId +
                ", theatreName='" + theatreName + '\'' +
                ", cityId=" + city +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


}
