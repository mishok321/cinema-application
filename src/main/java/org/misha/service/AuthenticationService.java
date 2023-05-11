package org.misha.service;

import org.misha.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
