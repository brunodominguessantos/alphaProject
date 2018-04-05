package org.academiadecodigo.alpha.model.places;

import org.academiadecodigo.alpha.model.AbstractModel;
import org.academiadecodigo.alpha.model.Comment;
import org.academiadecodigo.alpha.model.Rating;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;


public abstract class AbstractPlace extends AbstractModel implements Place {

    private String name;
    private String description;
    private String address;
    private List<Rating> ratings;
    private List<Comment> comments;
    private Integer openingTime;
    private Integer closingTime;

    public boolean isOpened() {

        return ( (openingTime < LocalDateTime.now().getHour()) && (LocalDateTime.now().getHour() < closingTime));

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public Rating getAverageRating(){

        return null;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Integer openingTime) {
        this.openingTime = openingTime;
    }

    public Integer getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Integer closingTime) {
        this.closingTime = closingTime;
    }
}
