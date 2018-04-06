package org.academiadecodigo.alpha.persistence.dao;

import org.academiadecodigo.alpha.model.Model;
import org.academiadecodigo.alpha.persistence.jpa.JpaSessionManager;
import org.academiadecodigo.alpha.persistence.jpa.SessionManager;


import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public abstract class AbstractDao<T extends Model> implements Dao <T> {

    protected SessionManager sm;
    protected Class<T> modelType;

    public AbstractDao(SessionManager sm, Class<T> modelType) {
        this.sm = sm;
        this.modelType = modelType;
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = sm.getCurrentSession().getCriteriaBuilder().createQuery(modelType);
        criteriaQuery.from(modelType);
        return sm.getCurrentSession().createQuery(criteriaQuery).getResultList();
    }

    @Override
    public T findById(Integer id) {

        return sm.getCurrentSession().find(modelType, id);
    }

    @Override
    public T saveOrUpdate(T t) {

            return sm.getCurrentSession().merge(t);
    }

    @Override
    public void delete(Integer id) {
            sm.getCurrentSession().remove(sm.getCurrentSession().find(modelType, id));

    }
}


