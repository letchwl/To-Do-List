package dev.raullalvespe.ToDoList.Principal;

import dev.raullalvespe.ToDoList.Services.EmailService;
import dev.raullalvespe.ToDoList.Services.ItemService;
import dev.raullalvespe.ToDoList.Services.UserService;

import java.util.Scanner;

public class MenuManager {

    public void userManager() {
        UserService userService = new UserService();
        ItemService itemService = new ItemService();
        EmailService emailService = new EmailService();
        Scanner sc = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            var menu = """
                    *** USER MANAGER ***
                    					
                    Users:
                    1. User List
                    2. Add New User
                    3. Delete User
                    					
                    Emails:
                    4. Email List
                    5. Add New Email
                    6. Delete Email
                    
                    Itens:
                    7. Item List
                    8. Add Item
                    9. Delete Item
                    					
                    0. Stop...
                    """;
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Users: " + userService.getUserList());
            } else if (opcao == 2) {
                userService.addNewUser();
            } else if (opcao == 3) {
                userService.removeUser();
            } else if (opcao == 4) {
                System.out.println("Emails: " + emailService.getEmailList());
            } else if (opcao == 5) {
                emailService.addNewEmail();
            } else if (opcao == 6) {
                emailService.removeEmail();
            } else if (opcao == 7) {
                System.out.println("Itens: " + itemService.getItemList());
            } else if (opcao == 8) {
                itemService.addNewItem();
            } else if (opcao == 9) {
                itemService.deleteItem();
            } else if (opcao == 0) {
                System.out.println("stopping...");
            }
        }
    }
}