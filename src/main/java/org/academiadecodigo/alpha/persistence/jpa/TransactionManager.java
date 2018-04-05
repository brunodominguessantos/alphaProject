package org.academiadecodigo.alpha.persistence.jpa;

public class TransactionManager {

    private SessionManager sm;

    public TransactionManager(SessionManager sm) {
        this.sm = sm;
    }

    public void beginRead() {
        sm.startSession();

    }


    public void beginWrite() {
        sm.getCurrentSession().getTransaction().begin();
    }

    public void commit() {

        if (sm.getCurrentSession().getTransaction().isActive()) {
            sm.getCurrentSession().getTransaction().commit();
        }
        sm.stopSession();
    }


    public void rollBack() {

        if (sm.getCurrentSession().getTransaction().isActive()) {
            sm.getCurrentSession().getTransaction().rollback();
        }
        sm.stopSession();
    }
}

