package org.misha.service.impl;

import java.util.Set;
import org.misha.model.Role;
import org.misha.model.User;
import org.misha.service.AuthenticationService;
import org.misha.service.RoleService;
import org.misha.service.ShoppingCartService;
import org.misha.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setRoles(Set.of(roleService.getByName(Role.RoleName.USER)));
        user.setEmail(email);
        user.setPassword(password);
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
