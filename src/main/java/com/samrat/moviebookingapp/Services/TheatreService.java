package com.samrat.moviebookingapp.Services;

import com.samrat.moviebookingapp.Entities.Theatre;

import java.util.List;

public interface TheatreService {
    Theatre acceptTheatreDetails(Theatre theatre);
    Theatre getTheatreDetails(int id) ;
    Theatre updateTheatreDetails(int id, Theatre theatre) ;
    boolean deleteTheatre(int id);
    List<Theatre> getAllTheatreDetails();
}
