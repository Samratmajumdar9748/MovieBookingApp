package com.samrat.moviebookingapp.Services;

import com.samrat.moviebookingapp.Dao.MovieDao;
import com.samrat.moviebookingapp.Entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    public MovieDao movieDao;


    @Override
    public Movie acceptMovieDetails(Movie movie) {
        return movieDao.save(movie);
    }

    @Override
    @Transactional
    public List<Movie> acceptMultipleMovieDetails(List<Movie> movieList) {

        List<Movie> savedMovies= new ArrayList<>();

        for (Movie movie: movieList){
            savedMovies.add(acceptMovieDetails(movie));
        }
        return savedMovies;
    }

    @Override
    public Movie getMovieDetails(int id) {
        return movieDao.findById(id).get();
    }

    @Override
    public Movie updateMovieDetails(int id, Movie movie) {
        Movie savedMovie= getMovieDetails(id);
        savedMovie.setMovieName(movie.getMovieName());
        savedMovie.setMovieDesc(movie.getMovieDesc());
        savedMovie.setDuration(movie.getDuration());
        savedMovie.setCoverPhotoUrl(movie.getCoverPhotoUrl());
        savedMovie.setReleaseDate(movie.getReleaseDate());
        savedMovie.setTrailerUrl(movie.getTrailerUrl());
        return movieDao.save(savedMovie) ;
    }

    @Override
    public boolean deleteMovie(int id) {


        if (getMovieDetails(id)==null)
        {
            return false;
        }

        else {
            movieDao.delete(getMovieDetails(id));
            return true;
        }

    }

    @Override
    public List<Movie> getAllMovies() {

        return movieDao.findAll();
    }

    @Override
    public Page<Movie> getPaginatedMovieDetails(Pageable pageRequest) {
        return movieDao.findAll(pageRequest);
    }
}
