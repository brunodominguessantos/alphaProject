package org.academiadecodigo.alpha.persistence.dao;

import org.academiadecodigo.alpha.model.places.AbstractPlace;
import org.academiadecodigo.alpha.persistence.jpa.JpaSessionManager;



public class PlaceDaoImpl extends AbstractDao<AbstractPlace>implements PlaceDao{


    public PlaceDaoImpl(JpaSessionManager sm){
        super(sm, AbstractPlace.class);
    }


}
