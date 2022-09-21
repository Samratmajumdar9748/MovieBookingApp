package com.samrat.moviebookingapp.Services;

import com.samrat.moviebookingapp.Dao.TheatreDao;
import com.samrat.moviebookingapp.Entities.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TheatreServiceImpl implements TheatreService{

    TheatreDao theatreDao;

    @Autowired
    TheatreServiceImpl(TheatreDao theatreDao){
        this.theatreDao=theatreDao;
    }

    @Override
    public Theatre acceptTheatreDetails(Theatre theatre) {
        return theatreDao.save(theatre);
    }

    @Override
    public Theatre getTheatreDetails(int id) {
        return theatreDao.findById(id).get() ;
    }

    @Override
    public Theatre updateTheatreDetails(int id, Theatre theatre) {
        Theatre savedTheatre = getTheatreDetails(id);
        savedTheatre.setTheatreName(theatre.getTheatreName());
        savedTheatre.setCity(theatre.getCity());
        savedTheatre.setTicketPrice(theatre.getTicketPrice());

        return acceptTheatreDetails(savedTheatre);
    }

    @Override
    public boolean deleteTheatre(int id) {
        Theatre ifTheatre= getTheatreDetails(id);
        if(ifTheatre!=null){
            theatreDao.delete(ifTheatre);
            return true;
        }
        else
            return false;
    }

    @Override
    public List<Theatre> getAllTheatreDetails() {
        return theatreDao.findAll();
    }
}
