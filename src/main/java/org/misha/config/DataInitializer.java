package org.misha.config;

import javax.annotation.PostConstruct;
import org.misha.model.Role;
import org.misha.service.RoleService;
import org.misha.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);

        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);

//        User defaultUser = new User();
//        defaultUser.setEmail("neadmin@i.ua");
//        defaultUser.setPassword("admin123");
//        defaultUser.setRoles(Set.of(userRole));
//
//        User user = new User();
//        user.setEmail("admin@i.ua");
//        user.setPassword("admin123");
//        user.setRoles(Set.of(adminRole));
//        userService.add(user);
//        userService.add(defaultUser);
    }
}