package org.academiadecodigo.alpha.persistence.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class JpaSessionManager implements SessionManager{

    private EntityManagerFactory emf;
    private EntityManager em;

    public JpaSessionManager(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public void startSession() {

        if (em == null) {
            em = emf.createEntityManager();
        }
    }

    @Override
    public void stopSession() {

        if (em != null) {
            em.close();
        }

        em = null;
    }

    @Override
    public EntityManager getCurrentSession() {
        startSession();
        return em;
    }
}
