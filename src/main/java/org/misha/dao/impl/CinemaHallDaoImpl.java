package org.misha.dao.impl;

import org.hibernate.SessionFactory;
import org.misha.dao.AbstractDao;
import org.misha.dao.CinemaHallDao;
import org.misha.model.CinemaHall;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
