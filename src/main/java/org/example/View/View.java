package org.example.View;

import org.example.Model.Base.User;
import org.example.Model.LearnGroupService;

import java.util.List;

public class View {

    /**
     * Вывод списка преподавателей в консоль
     *
     * @param userList список людей
     */
    public static void printListUser(List<User> userList) {
        for (User u : userList) {
            System.out.println(u);
        }
    }

    /**
     * Вывод списка групп в консоль
     *
     * @param listOfGroup список групп
     */

    public static void printAllGroup(List<LearnGroupService> listOfGroup) {
        int i = 1;
        for (LearnGroupService group : listOfGroup) {
            System.out.println("Группа №" + i++);
            System.out.println("-----------");
            System.out.print(group);
            System.out.println("***********");
        }
    }
}
