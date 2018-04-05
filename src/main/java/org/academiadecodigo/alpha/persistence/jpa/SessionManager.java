package org.academiadecodigo.alpha.persistence.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public interface SessionManager {

    void startSession();

    EntityManager getCurrentSession();

    void stopSession();

}
