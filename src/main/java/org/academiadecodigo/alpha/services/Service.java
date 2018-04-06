package org.academiadecodigo.alpha.services;

import org.academiadecodigo.alpha.model.AbstractModel;

import java.util.List;

public interface Service<T extends AbstractModel> {


    List<T> list();


    T get(Integer id);


    T save(T modelObject);


    void delete(Integer id);
}
