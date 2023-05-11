package org.misha.dao.impl;

import org.hibernate.SessionFactory;
import org.misha.dao.AbstractDao;
import org.misha.dao.MovieDao;
import org.misha.model.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
