package org.academiadecodigo.alpha.services;

import org.academiadecodigo.alpha.model.places.Place;

public interface PlaceService extends Service<Place> {

    public void rate(Integer placeId, Integer userId);
}
