package org.academiadecodigo.alpha.model.places;

import org.academiadecodigo.alpha.controller.ListController;
import org.academiadecodigo.alpha.model.Comment;
import org.academiadecodigo.alpha.model.Rating;

import java.util.List;

public interface Place {

    Rating getAverageRating();

    List<Comment> getComments();

    String getAddress();

    List<Rating> getRatings();
}
