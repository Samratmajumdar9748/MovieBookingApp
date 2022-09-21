package com.samrat.moviebookingapp;

import com.samrat.moviebookingapp.Dao.CustomerDao;
import com.samrat.moviebookingapp.Dao.CustomerDaoImpl;
import com.samrat.moviebookingapp.Dao.TheatreDao;
import com.samrat.moviebookingapp.Entities.City;
import com.samrat.moviebookingapp.Entities.Customer;
import com.samrat.moviebookingapp.Entities.Movie;
import com.samrat.moviebookingapp.Entities.Theatre;
import com.samrat.moviebookingapp.Services.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class MovieBookingAppApplication {

    public static void main(String[] args) {

        ApplicationContext context= SpringApplication.run(MovieBookingAppApplication.class, args);

//        CustomerDao customerDao= context.getBean(CustomerDaoImpl.class);
//
//        Customer customer= new Customer();
//
//        customer.setFirstName("Samrat");
//        customer.setLastName("Watson");
//        customer.setPassword("Somevalue");
//        customer.setUserName("email.com");
//        customer.setDateOfBirth(LocalDateTime.of(1999,02,27,6,0,0));
//
//        System.out.println("Before Saving : " + customer);
//        Customer savedCustomer= customerDao.save(customer);
//
//        System.out.println("After Saving : "+ savedCustomer);

//        TheatreDao theatreDao= context.getBean(TheatreDao.class);


/**
 * Testing movie service
 */
//        MovieService movieService= context.getBean(MovieService.class);
//
//        System.out.println("Movie service bean: "+ movieService);
//
//        Movie movie1= new Movie("Avengers","Must defeat thanos", LocalDate.of(2018,03,23),300,"https://coverphoto.url.com","hhtps://Trailor.url.com");
//        Movie movie2= new Movie("Avengers: Age of ultron","Must defeat Ultron", LocalDate.of(2018,03,24),280,"https://coverphoto.url.com","hhtps://Trailor.url.com");
//        Movie movie3= new Movie("Avengers: end game","Must defeat thanos in his home", LocalDate.of(2022,12,23),300,"https://coverphoto.url.com","hhtps://Trailor.url.com");
//        Movie movie4= new Movie("DDLJ","Shahrukh Khan stuff", LocalDate.of(2018,03,23),300,"https://coverphoto.url.com","hhtps://Trailor.url.com");
//
//        Movie savedMovie1= movieService.acceptMovieDetails(movie1);

        //System.out.println(savedMovie1);

        //Movie searchedMovie= movieService.getMovieDetails(savedMovie1.getMovieId());

        //System.out.println(searchedMovie);
//        Movie savedMovie2= movieService.acceptMovieDetails(movie2);
//        Movie savedMovie3= movieService.acceptMovieDetails(movie3);
//        Movie savedMovie4= movieService.acceptMovieDetails(movie4);
//
//        Pageable page1= PageRequest.of(0,2);
//        Page<Movie> moviesPage1= movieService.getPaginatedMovieDetails(page1);
//        System.out.println(moviesPage1);


    }

}
