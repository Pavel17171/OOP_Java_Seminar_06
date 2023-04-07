package org.example.Model.Student;

import org.example.Model.Base.User;

public class Student extends User {
    public Student(int id, String fio, int exp, int groupID) {
        super(id, fio, exp, groupID);
        this.type = "Student";
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "id " + id + ". " + type + ". " + fio
                + ", группа = " + groupID
                + ", курс - " + exp;
    }

}
