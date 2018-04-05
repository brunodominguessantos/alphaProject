package org.academiadecodigo.alpha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rating {

    private Integer rating;

    public Integer getRating() {
        return rating;
    }

}
