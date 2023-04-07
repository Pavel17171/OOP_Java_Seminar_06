package org.example.Model.Student;

import org.example.Model.Base.ServiceUser;
import org.example.Model.Base.User;

public class ServiceStudent extends ServiceUser {

    @Override
    public User create(User user) {
        return new Student(user.getId(), user.getFio(), user.getExp(), user.getGroupID());
    }
}
