package org.academiadecodigo.alpha.model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "")
public class Place extends AbstractModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
