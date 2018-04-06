package org.academiadecodigo.alpha.services;

import org.academiadecodigo.alpha.model.Rating;
import org.academiadecodigo.alpha.model.User;
import org.academiadecodigo.alpha.model.places.Place;
import org.academiadecodigo.alpha.persistence.dao.Dao;
import org.academiadecodigo.alpha.persistence.dao.PlaceDao;
import org.academiadecodigo.alpha.persistence.dao.UserDao;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManager;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class UserServiceImpl extends AbstractService<User> implements UserService  {

    private Integer userId;

    public UserServiceImpl(TransactionManager tm, UserDao genericDao) {
        super(tm, genericDao);
    }



    // GETTERS AND SETTERS

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
