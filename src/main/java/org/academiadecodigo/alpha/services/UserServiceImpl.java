package org.academiadecodigo.alpha.services;

import org.academiadecodigo.alpha.model.Rating;
import org.academiadecodigo.alpha.model.places.Place;
import org.academiadecodigo.alpha.persistence.dao.PlaceDao;
import org.academiadecodigo.alpha.persistence.dao.UserDao;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManager;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class UserServiceImpl extends AbstractService implements UserService  {


    private UserDao userDao;
    private PlaceDao placeDao;
    private TransactionManager transactionManager;
    private Integer placeId;
    private Integer userId;

    public UserServiceImpl(UserDao userDao, PlaceDao placeDao, TransactionManager transactionManager, Integer userId){
        this.userDao = userDao;
        this.placeDao = placeDao;
        this.transactionManager = transactionManager;
    }

    public void rate(){

    if(!canRate()){
        return;
    }

    transactionManager.beginWrite();
    Place place = placeDao.findById(userId);



    }



    private boolean canRate(){

        transactionManager.beginRead();
        Place place = placeDao.findById(placeId);

        List<Rating> ratings = new LinkedList<>();
        ratings = place.getRatings();

        for (Rating rating : ratings) {
            if( rating.getUserId() == userId){
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
