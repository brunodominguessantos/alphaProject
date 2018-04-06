package org.academiadecodigo.alpha.persistence.dao;

import org.academiadecodigo.alpha.model.Rating;
import org.academiadecodigo.alpha.persistence.jpa.SessionManager;

public class RatingDaoImpl extends AbstractDao<Rating> implements RatingDao{

    public RatingDaoImpl(SessionManager sm) {
        super(sm, Rating.class);
    }
}
