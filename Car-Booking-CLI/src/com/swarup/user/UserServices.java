package com.swarup.user;

import java.util.UUID;

public class UserServices {
        public final UserDao userDao= new UserDao();

        public User[] getAllUsers(){
            return userDao.getAllUser();
        }
        public User getUserById(UUID id){
            for (User user : getAllUsers()) {
                if(id.equals(user.getId())){
                    return user;
                }
            }
            throw new IllegalStateException(String.format("user with %s userid not found", id));
        }

}
