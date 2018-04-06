package org.academiadecodigo.alpha.model;

import org.academiadecodigo.alpha.model.places.Place;

import javax.persistence.*;

@Entity
@Table(name = "rating")
public class Rating extends AbstractModel{

    private Integer rating;
    private Integer userId;

    @ManyToOne
    private Place place;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Place getPlace() {
        return place;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
