package org.academiadecodigo.alpha.persistence.dao;

import org.academiadecodigo.alpha.model.places.Place;
import org.academiadecodigo.alpha.persistence.jpa.JpaSessionManager;
import org.academiadecodigo.alpha.persistence.jpa.SessionManager;


public class PlaceDaoImpl extends AbstractDao<Place>implements PlaceDao{


    public PlaceDaoImpl(SessionManager sm){
        super(sm, Place.class);
    }


}
