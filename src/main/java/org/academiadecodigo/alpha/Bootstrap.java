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
import org.academiadecodigo.alpha.services.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

public class Bootstrap {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prod");
    SessionManager sessionManager = new JpaSessionManager(entityManagerFactory);
    TransactionManager tx = new TransactionManagerImpl(sessionManager);

    public void wireDependencies(){
        UserDaoImpl userDao = new UserDaoImpl(sessionManager);
        PlaceDaoImpl placeDao = new PlaceDaoImpl(sessionManager);
        CommentDaoImpl commentDao = new CommentDaoImpl(sessionManager);
        RatingDaoImpl ratingDao = new RatingDaoImpl(sessionManager);

        UserServiceImpl userService = new UserServiceImpl(tx, userDao);
        PlaceServiceImpl placeService = new PlaceServiceImpl(tx, placeDao);
        CommentServiceImpl commentService = new CommentServiceImpl(tx, commentDao);
        RatingServiceImpl ratingService = new RatingServiceImpl(tx, ratingDao);

        ServiceRegistry.getServiceRegistry().registerService(RatingService.class.getSimpleName(), ratingService);
        ServiceRegistry.getServiceRegistry().registerService(PlaceService.class.getSimpleName(), placeService);
        ServiceRegistry.getServiceRegistry().registerService(CommentService.class.getSimpleName(), commentService);
        ServiceRegistry.getServiceRegistry().registerService(UserService.class.getSimpleName(), userService);
    }

    //Dao Tests
    public void testUserDao(){


        UserDao userDao = new UserDaoImpl(sessionManager);
        User ruben = new User();
        ruben.setName("Ácaro");
        System.out.println(ruben.getName());

        tx.beginWrite();
        userDao.saveOrUpdate(ruben);
        tx.commit();

    }

    public void testPlaceDao(){
        UserDao userDao = new UserDaoImpl(sessionManager);
        PlaceDao placeDao = new PlaceDaoImpl(sessionManager);
        RatingDao ratingDao = new RatingDaoImpl(sessionManager);
        CommentDao commentDao = new CommentDaoImpl(sessionManager);

        User acaro = userDao.findById(1);

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
