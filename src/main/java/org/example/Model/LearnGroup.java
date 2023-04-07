package org.example.Model;

import org.example.Model.Student.Student;
import org.example.Model.Teacher.Teacher;

import java.util.List;

public abstract class LearnGroup {
    Teacher teacher;
    List<Student> studentsGroup;

    public LearnGroup(Teacher teacher, List<Student> studentsGroup) {
        this.teacher = teacher;
        this.studentsGroup = studentsGroup;
    }
}