package org.example.Model.Teacher;

import org.example.Model.Base.User;

public class Teacher extends User {
    public Teacher(int id, String fio, int exp, int groupID) {
        super(id, fio, exp, groupID);
        this.type = "Teacher";
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "id " + id + ". " + type + ". " + fio
                + ", стаж = " + exp + " лет"
                + ", группа = " + groupID;
    }
}
