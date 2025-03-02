package dev.raullalves.UserManager.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailService {
    Scanner sc = new Scanner(System.in);

    private List<String> emailList = new ArrayList<String>();

    public List<String> getEmailList() {
        return emailList;
    }

    public void addNewEmail() {
        System.out.println("New Email to add: " );
        String newEmail;
        newEmail = sc.nextLine();
        System.out.println("Email Added!");
        emailList.add(newEmail);
    }

    public void removeEmail() {
        System.out.println("Email to delete: " );
        String deleteEmail;
        deleteEmail = sc.nextLine();
        System.out.println("Email deleted...");
        emailList.remove(deleteEmail);
    }
}
