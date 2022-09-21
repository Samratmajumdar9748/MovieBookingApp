package com.samrat.moviebookingapp.Dao;

import com.samrat.moviebookingapp.Entities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreDao extends JpaRepository<Theatre,Integer> {
    Theatre findByTheatreName(String theatreName);
    List<Theatre> findByTicketPriceLessThan(int ticketPrice);
    List<Theatre> findByTheatreNameContaining(String theatreName);
}
