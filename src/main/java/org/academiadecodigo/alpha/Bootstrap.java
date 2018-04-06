package org.academiadecodigo.alpha;


import org.academiadecodigo.alpha.model.Place;
import org.academiadecodigo.alpha.persistence.dao.UserDao;
import org.academiadecodigo.alpha.persistence.dao.UserDaoImpl;
import org.academiadecodigo.alpha.persistence.jpa.JpaSessionManager;
import org.academiadecodigo.alpha.persistence.jpa.SessionManager;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManager;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManagerImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prod");

    public void testUserDao(){

        SessionManager sessionManager = new JpaSessionManager(entityManagerFactory);
        TransactionManager tx = new TransactionManagerImpl(sessionManager);
        UserDao userDao = new UserDaoImpl(sessionManager);
        Place ruben = new Place();
        ruben.setName("Ruben");
        System.out.println(ruben.getName());

        tx.beginWrite();
        userDao.saveOrUpdate(ruben);
        tx.commit();

    }


}
