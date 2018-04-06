package org.academiadecodigo.alpha;


import org.academiadecodigo.alpha.model.Comment;
import org.academiadecodigo.alpha.model.Rating;
import org.academiadecodigo.alpha.model.User;
import org.academiadecodigo.alpha.model.places.Disco;
import org.academiadecodigo.alpha.model.places.Place;
import org.academiadecodigo.alpha.persistence.dao.*;
import org.academiadecodigo.alpha.persistence.jpa.JpaSessionManager;
import org.academiadecodigo.alpha.persistence.jpa.SessionManager;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManager;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManagerImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prod");
    SessionManager sessionManager = new JpaSessionManager(entityManagerFactory);
    TransactionManager tx = new TransactionManagerImpl(sessionManager);

    public void wireDependencies(){

    }


    //Dao Tests
    public void testUserDao(){


        UserDao userDao = new UserDaoImpl(sessionManager);
        User ruben = new User();
        ruben.setName("Ruben");
        System.out.println(ruben.getName());

        tx.beginWrite();
        userDao.saveOrUpdate(ruben);
        tx.commit();

    }

    public void testPlaceDao(){
        PlaceDao placeDao = new PlaceDaoImpl(sessionManager);
        RatingDao ratingDao = new RatingDaoImpl(sessionManager);
        CommentDao commentDao = new CommentDaoImpl(sessionManager);

        Place lux = new Disco();
        lux.setName("Lux");
        lux.setDescription("Where happiness is found");

        Comment comment = new Comment();
        comment.setComment("THIS SHIT SUCKS");

        Rating rating = new Rating();
        rating.setRating(1);

        tx.beginWrite();
        placeDao.saveOrUpdate(lux);
        tx.commit();

        tx.beginWrite();
        Place place = placeDao.findById(1);

        place.addComment(comment);
        place.addRating(rating);

        commentDao.saveOrUpdate(comment);
        ratingDao.saveOrUpdate(rating);
        tx.commit();





    }


}
