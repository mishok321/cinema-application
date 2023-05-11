package org.misha.dao.impl;

import org.hibernate.SessionFactory;
import org.misha.dao.AbstractDao;
import org.misha.dao.TicketDao;
import org.misha.model.Ticket;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
