package com.samrat.moviebookingapp.Dao;

import com.samrat.moviebookingapp.Entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movie,Integer> {

}
