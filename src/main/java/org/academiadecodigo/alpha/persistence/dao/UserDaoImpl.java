package org.academiadecodigo.alpha.persistence.dao;

import org.academiadecodigo.alpha.model.User;
import org.academiadecodigo.alpha.persistence.jpa.SessionManager;


public class UserDaoImpl extends AbstractDao<User> implements UserDao {

    public UserDaoImpl(SessionManager sm) {
        super(sm, User.class);
    }


}