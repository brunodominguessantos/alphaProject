package org.academiadecodigo.alpha.services;

import org.academiadecodigo.alpha.model.places.Place;
import org.academiadecodigo.alpha.persistence.dao.PlaceDao;
import org.academiadecodigo.alpha.persistence.dao.UserDao;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManager;

public class UserServiceImpl extends AbstractSevice implements UserService  {


    private UserDao userDao;
    private PlaceDao placeDao;
    private TransactionManager transactionManager;
    private Integer placeId;

    public UserServiceImpl(UserDao userDao, PlaceDao placeDao, TransactionManager transactionManager){
        this.userDao = userDao;
        this.placeDao = placeDao;
        this.transactionManager = transactionManager;
    }

    public void rate(){


    transactionManager.beginWrite();


    }



    private boolean canRate(){

        transactionManager.beginRead();
        Place place = placeDao.findById(placeId);


    }


}
