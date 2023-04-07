package org.example.Contol;

import org.example.Model.LearnGroupService;
import org.example.Model.Student.AllStudents;
import org.example.Model.Student.Student;
import org.example.Model.Teacher.AllTeachers;
import org.example.Model.Teacher.Teacher;
import org.example.View.View;

import java.util.Scanner;

public class Control {
    public static void main(String[] args) {

        // Предварительное заполнение списка людей
        tempListOfUsers();

        // Запуск программы
        start();

    }


    public static void start() {
        boolean flag = true;
        while (flag) {
            System.out.println("""

                    Введите команду:
                    1 - вывести список преподавателей
                    2 - вывести список студентов
                    3 - добавить преподавателя
                    4 - добавить студента
                    5 - создать группы
                    0 - выход
                    """);
            switch (answer()) {
                case 0:
                    flag = false;
                    System.out.println("EXIT");
                    break;
                case 1:
                    System.out.println("Список преподавателей");
                    View.printListUser(AllTeachers.allTeachers);
                    break;
                case 2:
                    System.out.println("Список студентов");
                    View.printListUser(AllStudents.allStudents);
                    break;
                case 3:
                    System.out.println("Добавить преподавателя");
                    AllTeachers.setNewTeacher();
                    break;
                case 4:
                    System.out.println("Добавить студента");
                    AllStudents.setNewStudent();
                    break;
                case 5:
                    System.out.println("Создать группы");
                    View.printAllGroup(LearnGroupService.allGroup());
                    break;
                default:
                    System.out.println("Команда не известна");
            }
        }
    }


    /**
     * Получение ответа от пользователя
     *
     * @return возвращает ответ пользователя
     */
    public static Integer answer() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }







    //***************************************************************************************

    // Первоначальное заполнение списка преподавателей и студентов
    // (для примера, чтобы создавать связи с текстовыми файлами)
    public static void tempListOfUsers() {

        // Составление списка преподавателей
        AllTeachers allTeachers = new AllTeachers(new Teacher());
        allTeachers.setAllUsers(new Teacher(101, "Немирова Анна Петровна", 5, 0));
        allTeachers.setAllUsers(new Teacher(102, "Мартынова Анастасия Евгеньевна", 7, 0));
        allTeachers.setAllUsers(new Teacher(103, "Пруглов Лев Борисович", 25, 0));

        // Составление списка студентов
        AllStudents allStudents = new AllStudents(new Student());
        allStudents.setAllUsers(new Student(201, "Алмазова Инна Эдуардовна", 1, 0));
        allStudents.setAllUsers(new Student(202, "Иванов Иван Ивановичй", 1, 0));
        allStudents.setAllUsers(new Student(203, "Петров Петр Сидорович", 1, 0));
        allStudents.setAllUsers(new Student(204, "Сидоров Василий Иоганович", 1, 0));
        allStudents.setAllUsers(new Student(205, "Сазонов Олег Андреевич", 1, 0));
        allStudents.setAllUsers(new Student(206, "Шишкин Максим Иванович", 1, 0));
        allStudents.setAllUsers(new Student(207, "Марков Александр Петрович", 1, 0));
        allStudents.setAllUsers(new Student(208, "Лисицина Инна Павловна", 1, 0));
        allStudents.setAllUsers(new Student(209, "Самопалова Василиса Ильинична", 1, 0));
        allStudents.setAllUsers(new Student(210, "Ильина Лилия Сергеевна", 1, 0));
        allStudents.setAllUsers(new Student(211, "Мартынов Илья Васильевич", 1, 0));
        allStudents.setAllUsers(new Student(212, "Дуболазова Ирина Олеговна", 1, 0));
        allStudents.setAllUsers(new Student(213, "Терехова Мария Александровна", 1, 0));
        allStudents.setAllUsers(new Student(214, "Овсянникова Оксана Александровна", 1, 0));

        AllTeachers.getAllTeachers();
        AllStudents.getAllStudents();

    }
}
