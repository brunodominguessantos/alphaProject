package org.academiadecodigo.alpha.model;

import javax.persistence.Entity;


@Entity
public class User extends AbstractModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {

    }
}
