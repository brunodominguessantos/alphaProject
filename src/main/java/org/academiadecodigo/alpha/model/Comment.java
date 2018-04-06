package org.academiadecodigo.alpha.model;

import org.academiadecodigo.alpha.model.places.Place;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment extends AbstractModel{

    private String comment;
    private Integer userId;

    @ManyToOne
    private Place place;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
