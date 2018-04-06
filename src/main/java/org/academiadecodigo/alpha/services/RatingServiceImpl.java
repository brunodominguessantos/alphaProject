package org.academiadecodigo.alpha.services;

import org.academiadecodigo.alpha.model.Rating;
import org.academiadecodigo.alpha.persistence.dao.Dao;
import org.academiadecodigo.alpha.persistence.dao.RatingDao;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManager;

public class RatingServiceImpl extends AbstractService<Rating> implements RatingService{
    public RatingServiceImpl(TransactionManager tm, RatingDao genericDao) {
        super(tm, genericDao);
    }
}
