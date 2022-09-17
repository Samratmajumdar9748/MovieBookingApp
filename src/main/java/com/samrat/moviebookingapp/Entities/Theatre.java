package com.samrat.moviebookingapp.Entities;


import javax.persistence.*;

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
    private City cityId;

    @Column(name = "ticket_price",nullable = false)
    private float ticketPrice=150.00f;

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId=" + theatreId +
                ", theatreName='" + theatreName + '\'' +
                ", cityId=" + cityId +
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

    public City getCityId() {
        return cityId;
    }

    public void setCityId(City cityId) {
        this.cityId = cityId;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
