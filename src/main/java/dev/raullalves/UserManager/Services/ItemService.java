package dev.raullalves.UserManager.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemService {
    Scanner sc = new Scanner(System.in);

    private List<String> itemList = new ArrayList<String>();

    public List<String> getItemList() {
        return itemList;
    }

    public void addNewItem() {
        System.out.println("Item to add: " );
        String newItem;
        newItem = sc.nextLine();
        System.out.println("Item Added!");
        itemList.add(newItem);
    }

    public void deleteItem() {
        System.out.println("Item to delete: " );
        String deleteItem;
        deleteItem = sc.nextLine();
        System.out.println("Item deleted!");
        itemList.remove(deleteItem);
    }
}