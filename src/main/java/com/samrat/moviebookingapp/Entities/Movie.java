package com.samrat.moviebookingapp.Entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id",length = 10)
    private int movieId;
    @Column(name = "movie_name",nullable = false,unique = true,length = 50)
    private String movieName;
    @Column(name = "movie_desc",nullable = false,length = 500)
    private String movieDesc;
    @Column(name = "release_date",nullable = false)
    private LocalDate releaseDate;
    @Column(nullable = false)
    private int duration;
    @Column(nullable = false,length = 500)
    private String coverPhotoUrl;
    @Column(nullable = false,length = 500)
    private String trailerUrl;

    @ManyToMany
    private Set<Theatre> theatreSet;
    public Movie(){

    }

    public Movie(String movieName, String movieDesc, LocalDate releaseDate, int duration, String coverPhotoUrl, String trailerUrl) {
        this.movieName = movieName;
        this.movieDesc = movieDesc;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.coverPhotoUrl = coverPhotoUrl;
        this.trailerUrl = trailerUrl;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDesc='" + movieDesc + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", coverPhotoUrl='" + coverPhotoUrl + '\'' +
                ", trailerUrl='" + trailerUrl + '\'' +
                '}';
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }


}
