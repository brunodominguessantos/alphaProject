package org.academiadecodigo.alpha.persistence.dao;

import org.academiadecodigo.alpha.model.Place;
import org.academiadecodigo.alpha.persistence.jpa.SessionManager;


public class UserDaoImpl extends AbstractDao<Place> implements UserDao {

    public UserDaoImpl(SessionManager sm) {
        super(sm, Place.class);
    }


}