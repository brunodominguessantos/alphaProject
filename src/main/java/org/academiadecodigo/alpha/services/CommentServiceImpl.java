package org.academiadecodigo.alpha.services;

import org.academiadecodigo.alpha.model.Comment;
import org.academiadecodigo.alpha.persistence.dao.CommentDao;
import org.academiadecodigo.alpha.persistence.jpa.TransactionManager;

public class CommentServiceImpl extends AbstractService<Comment> implements CommentService {

    public CommentServiceImpl(TransactionManager tm, CommentDao genericDao) {
        super(tm, genericDao);
    }
}
