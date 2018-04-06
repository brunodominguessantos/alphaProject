package org.academiadecodigo.alpha.model;

import javax.persistence.*;

@Entity
@Table(name = "rating")
public class Rating extends AbstractModel{

    private Integer rating;

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

    public void setPlace(Place place) {
        this.place = place;
    }
}
