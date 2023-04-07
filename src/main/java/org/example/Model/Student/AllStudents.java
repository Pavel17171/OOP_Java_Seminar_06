package org.example.Model.Student;

import org.example.Model.Base.AllUsers;
import org.example.Model.Base.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllStudents extends AllUsers {

    public static List<User> allStudents = new ArrayList<>();

    public AllStudents(Student student) {
        super(student);
    }

    public static void setAllStudents(Student student) {
        allStudents.add(student);
    }

    public static List<User> getAllStudents() {
        allStudents = new ArrayList<>();
        for (User u : AllUsers.getAllUsers()) {
            if (u.getType().equals("Student")) {
                setAllStudents((Student) u);
            }
        }
        return allStudents;
    }

    public static void setNewStudent() {
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
        System.out.println("курс: ");
        int exp = sc.nextInt();
        setAllStudents(new Student(id, fio, exp, 0));
    }

}
