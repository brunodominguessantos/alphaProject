package org.academiadecodigo.alpha.model.places;

import org.academiadecodigo.alpha.model.AbstractModel;
import org.academiadecodigo.alpha.model.Comment;
import org.academiadecodigo.alpha.model.Rating;

import javax.persistence.*;
import java.time.LocalDateTime;

import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "place")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "place_type")
public abstract class Place extends AbstractModel {

    private String name;
    private String description;
    private String address;

    @OneToMany( // TODO : verify this

            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "place",

            fetch = FetchType.LAZY
    )
    private List<Rating> ratings = new LinkedList<>();

    @OneToMany( // TODO : verify this

            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "place",

            fetch = FetchType.EAGER
    )
    private List<Comment> comments = new LinkedList<>();
    private Integer openingTime;
    private Integer closingTime;
    private String picturePath;

    public boolean isOpened() {

        return ( (openingTime < LocalDateTime.now().getHour()) && (LocalDateTime.now().getHour() < closingTime));

    }

    public void addComment(Comment comment){
        comments.add(comment);
        comment.setPlace(this);
    }

    public void addRating(Rating rating){
        ratings.add(rating);
        rating.setPlace(this);
    }


    //GETTERS AND SETTERS

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


    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Rating getAverageRating(){

        return null;
    }

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
