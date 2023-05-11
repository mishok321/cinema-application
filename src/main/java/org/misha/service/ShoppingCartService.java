package org.misha.service;

import org.misha.model.MovieSession;
import org.misha.model.ShoppingCart;
import org.misha.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
