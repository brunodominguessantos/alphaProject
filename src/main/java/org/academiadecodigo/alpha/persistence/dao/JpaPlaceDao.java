package org.academiadecodigo.alpha.persistence.dao;

import org.academiadecodigo.alpha.model.places.AbstractPlace;
import org.academiadecodigo.alpha.persistence.jpa.JpaSessionManager;

public class JpaPlaceDao extends AbstractDao<AbstractPlace> implements PlaceDao {

    public JpaPlaceDao(JpaSessionManager sm, Class<AbstractPlace> modelType) {
        super(sm, modelType);
    }
}
