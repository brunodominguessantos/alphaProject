package org.academiadecodigo.alpha.model.places;

import org.academiadecodigo.alpha.model.AbstractModel;
import org.academiadecodigo.alpha.model.Comment;
import org.academiadecodigo.alpha.model.Rating;

import java.util.List;


public abstract class AbstractPlace extends AbstractModel implements Place {

    private String name;
    private String description;
    private List<Rating> ratings;
    private List<Comment> comments;


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
}
