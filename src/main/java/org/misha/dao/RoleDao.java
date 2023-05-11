package org.misha.dao;

import java.util.Optional;
import org.misha.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(Role.RoleName roleName);
}
