package org.academiadecodigo.alpha.services;

import org.academiadecodigo.alpha.model.Rating;
import org.academiadecodigo.alpha.model.places.Place;

public class PlaceService extends AbstractSevice {


    public Rating createRate(Integer userId, Place place){

        Rating rate = new Rating( userId,  place );
        place.addRating(rate);

        return null;
    }

}
