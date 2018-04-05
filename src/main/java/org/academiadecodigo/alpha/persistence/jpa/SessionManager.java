package org.academiadecodigo.alpha.persistence.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class SessionManager {


        private EntityManagerFactory emf;
        private EntityManager em;

        public SessionManager(EntityManagerFactory emf){
            this.emf = emf;
            em = emf.createEntityManager();
        }


        public void startSession() {

            if (em == null) {
                em = emf.createEntityManager();

            }
        }

        public EntityManager getCurrentSession() {
            startSession();
            return em;

        }

        public void stopSession() {

            if (em != null) {
                em.close();
            }
            em = null;
        }

}
