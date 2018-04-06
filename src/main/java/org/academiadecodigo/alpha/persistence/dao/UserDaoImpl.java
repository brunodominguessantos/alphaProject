package org.academiadecodigo.alpha.persistence.dao;

import org.academiadecodigo.alpha.model.User;
import org.academiadecodigo.alpha.persistence.jpa.JpaSessionManager;

import javax.persistence.RollbackException;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


public class UserDaoImpl extends AbstractDao<User> implements UserDao {

    public UserDaoImpl(JpaSessionManager sm, Class<User> modelType) {
        super(sm, modelType);
    }


}