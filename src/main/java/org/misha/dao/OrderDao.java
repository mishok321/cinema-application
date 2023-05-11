package org.misha.dao;

import java.util.List;
import org.misha.model.Order;
import org.misha.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
