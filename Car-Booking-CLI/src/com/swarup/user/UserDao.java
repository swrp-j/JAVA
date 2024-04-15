package com.swarup.user;

import java.util.UUID;

public class UserDao {
    private static final User[] users;

    static {
        users = new User[]{
                new User(UUID.randomUUID(), "Jim"),
                new User(UUID.randomUUID(), "Jamila"),
        };

    }

        public User[] getAllUser(){
            return users;
        }

    }

