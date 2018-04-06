package org.academiadecodigo.alpha.persistence.jpa;

public class TransactionException extends RuntimeException{

    public TransactionException(Throwable rollbackException) {
        super(rollbackException);
    }
}
