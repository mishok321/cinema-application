package org.misha.service;

import java.util.List;
import org.misha.model.Order;
import org.misha.model.ShoppingCart;
import org.misha.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
