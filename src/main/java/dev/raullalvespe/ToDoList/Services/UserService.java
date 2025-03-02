package dev.raullalvespe.ToDoList.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    Scanner sc = new Scanner(System.in);

    private List<String> userList = new ArrayList<String>();

    public List<String> getUserList() {
        return userList;
    }

    public void addNewUser() {
        System.out.println("New User to add: " );
        String newUser;
        newUser = sc.nextLine();
        System.out.println("User Added!");
        userList.add(newUser);
    }

    public void removeUser() {
        System.out.println("User to delete: " );
        String deleteUser;
        deleteUser = sc.nextLine();
        System.out.println("User deleted...");
        userList.remove(deleteUser);
    }
}