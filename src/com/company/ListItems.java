package com.company;

import java.util.List;
import java.util.Scanner;

public class ListItems {
    public static void CreateItems(List<Items> li) {
        System.out.println("Please enter 'items'");
        Scanner sc0 = new Scanner(System.in);
        String choiceClass = sc0.next().toLowerCase();
        if (choiceClass.equals("items")) {
            System.out.println("Enter a Item Name : ");
            Scanner sc = new Scanner(System.in);
            String choiceItemName = sc.next().toLowerCase();
            System.out.println("Enter a Item Reference : ");
            Scanner sc1 = new Scanner(System.in);
            String choiceItemReference = sc1.next().toUpperCase();
            System.out.println("Enter a Item Category : ");
            Scanner sc2 = new Scanner(System.in);
            String choiceItemCategory = sc2.next().toLowerCase();
            System.out.println("Enter a Item Scarcity  : ");
            Scanner sc3 = new Scanner(System.in);
            int choiceScarcity = Integer.parseInt(sc3.next());

            Items i1 = new Items(choiceItemName, choiceItemReference, choiceItemCategory, choiceScarcity);
            li.add(i1);
            System.out.println(i1);
        }
    }
}
