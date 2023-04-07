package org.example.Model.Teacher;

import org.example.Model.Base.ServiceUser;
import org.example.Model.Base.User;

public class ServiceTeacher extends ServiceUser {
    @Override
    public User create(User user) {
        return new Teacher(user.getId(), user.getFio(), user.getExp(), user.getGroupID());
    }
}
