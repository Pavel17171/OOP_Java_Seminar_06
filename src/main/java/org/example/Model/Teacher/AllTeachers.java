package org.example.Model.Teacher;

import org.example.Model.Base.AllUsers;
import org.example.Model.Base.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllTeachers extends AllUsers {

    public static List<User> allTeachers = new ArrayList<>();

    public AllTeachers(Teacher teacher) {
        super(teacher);
    }

    public static void setAllTeachers(Teacher teacher) {
        allTeachers.add(teacher);
    }

    public static List<User> getAllTeachers() {
        allTeachers = new ArrayList<>();
        for (User u : AllUsers.getAllUsers()) {
            if (u.getType().equals("Teacher")) {
                setAllTeachers((Teacher) u);
            }
        }
        return allTeachers;
    }

    public static void setNewTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id: ");
        int id = sc.nextInt();
        System.out.println("Фамилия: ");
        String f = sc.next();
        System.out.println("Имя: ");
        String i = sc.next();
        System.out.println("Отчество: ");
        String o = sc.next();
        String fio = f + " " + i + " " + o;
        System.out.println("стаж: ");
        int exp = sc.nextInt();
        setAllTeachers(new Teacher(id, fio, exp, 0));
    }
}
