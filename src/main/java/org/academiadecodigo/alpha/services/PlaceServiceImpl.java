package org.academiadecodigo.alpha.services;

import org.academiadecodigo.alpha.model.Rating;
import org.academiadecodigo.alpha.model.places.Place;

import org.academiadecodigo.alpha.persistence.dao.PlaceDao;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManager;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class PlaceServiceImpl extends AbstractService<Place> implements PlaceService  {

    public PlaceServiceImpl(TransactionManager tm, PlaceDao genericDao) {
        super(tm, genericDao);
    }

    public void rate(Integer placeId, Integer userId){

        if(!canRate(placeId, userId)){
            return;
        }

        tm.beginWrite();
        Place place = genericDao.findById(placeId);
        Rating rating = new Rating();
        place.addRating(rating);
        genericDao.saveOrUpdate(place);
        tm.commit();
    }

    private boolean canRate(Integer placeId, Integer userId){

        tm.beginRead();
        Place place = genericDao.findById(placeId);

        List<Rating> ratings = new LinkedList<>();
        ratings = place.getRatings();

        for (Rating rating : ratings) {
            if( rating.getUserId().equals(userId)){
                return checkTime(rating);
            }
        }
        return false;
    }

    private boolean checkTime(Rating rating){

        Integer actualTime = LocalDateTime.now().getHour();
        Integer lastRateTime = rating.getCreationTime().getHours();
        if(actualTime == lastRateTime) {
            return false;
        }
        return  true;

    }
}
