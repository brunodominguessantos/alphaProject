package org.academiadecodigo.alpha.services;

import org.academiadecodigo.alpha.model.AbstractModel;
import org.academiadecodigo.alpha.persistence.dao.Dao;
import org.academiadecodigo.alpha.persistence.jpa.TransactionException;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManager;

import java.util.List;

public abstract class AbstractService<T extends AbstractModel> implements Service<T>{

    protected TransactionManager tm;
    protected Dao<T> genericDao;


    public AbstractService(TransactionManager tm, Dao<T> genericDao) {
        this.tm = tm;
        this.genericDao = genericDao;
    }


    @Override
    public List<T> list() {

        return genericDao.findAll();

    }

    @Override
    public T get(Integer id) {

        return genericDao.findById(id);

    }

    @Override
    public T save(T modelObject) {

        try {
            tm.beginWrite();
            T savedObject = genericDao.saveOrUpdate(modelObject);
            tm.commit();

            return savedObject;

        } catch (TransactionException ex) {
            tm.rollBack();
            return null;
        }
    }

    @Override
    public void delete(Integer id) {

        tm.beginRead();

        try {
            tm.beginWrite();
            genericDao.delete(id);
            tm.commit();

        } catch (TransactionException ex) {
            tm.rollBack();

        }
    }


}
