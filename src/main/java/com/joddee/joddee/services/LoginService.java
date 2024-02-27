package com.joddee.joddee.services;

import com.joddee.joddee.exception.LoginException;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public void login(String username, String password) throws LoginException {
        if (username.isEmpty()) {
            throw new LoginException("Username is Empty");
        }
        if (password.isEmpty()) {
            throw new LoginException("Password is Empty");
        }

        if (!username.equals("admin") || !password.equals("password")) {
            throw new LoginException("Invalid username or password");
        }
    }
}
