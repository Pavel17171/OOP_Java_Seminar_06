package org.example.Model.Base;

import java.util.ArrayList;
import java.util.List;


public class AllUsers {
    protected static List<User> allUsers = new ArrayList<>();
    protected User user;

    public AllUsers(User user) {
        this.user = user;
    }

    public static List<User> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(User user) {
        allUsers.add(user);
    }

}
