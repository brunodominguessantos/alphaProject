package org.academiadecodigo.alpha.persistence.jpa;

public interface TransactionManager {

    void beginRead();

    void beginWrite();

    void commit();

    void rollBack();

}
