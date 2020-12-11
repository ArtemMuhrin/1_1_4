package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {

    private static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanovich", (byte)25);
        userService.saveUser("Petr", "Petrovich", (byte)30);
        userService.saveUser("Stepan", "Stepanovich", (byte)36);
        List<User> users = userService.getAllUsers();
        for (User user: users) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
