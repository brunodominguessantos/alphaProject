package org.academiadecodigo.alpha.persistence.dao;

import org.academiadecodigo.alpha.model.Comment;
import org.academiadecodigo.alpha.persistence.jpa.SessionManager;

public class CommentDaoImpl extends AbstractDao<Comment> implements CommentDao{

    public CommentDaoImpl(SessionManager sm) {
        super(sm, Comment.class);
    }
}
