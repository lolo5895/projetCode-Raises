package com.company;

import java.util.List;
import java.util.Scanner;

public class ListItems {
    /**
     * create a new items and ckecks that there is not the same items twice
     * @param li list of items
     */
    public static void CreateItems(List<Items> li) {
        System.out.println("Please enter 'items'");
        Scanner sc0 = new Scanner(System.in);
        String choiceClass = sc0.next().toLowerCase();
        if (choiceClass.equals("items")) {
            System.out.println("Enter a Item Name : ");
            Scanner sc = new Scanner(System.in);
            String choiceItemName = sc.next().toLowerCase();
            String choiceItemReference;
            boolean ReferenceItemExist = false;
            do {
                System.out.println("Enter a Item Reference : ");
                Scanner sc1 = new Scanner(System.in);
                choiceItemReference = sc1.next().toUpperCase();
                if (ListItems.FoundItems(choiceItemReference,li)!=null) {
                    System.out.println("The items exists, please try again ");
                } else {
                    ReferenceItemExist = true;
                }
            }while (ReferenceItemExist==false);
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

    /**
     * display the list of items
     * @param li list of items
     */
    public static void DisplayItems(List<Items>li){
        if(li.isEmpty()){
            System.out.println("List empty");
        }else
            for (int j = 0;j<li.size();j++){
                Items i= li.get(j);
                System.out.println(i);
            }
    }

    /**
     * look for an items with its reference
     * @param referenceItems
     * @param li list of items
     * @return a items
     */
    public static Items FoundItems(String referenceItems, List<Items>li){
        try {
            for (Items i:li ) {
                if (i.getReference().equals(referenceItems)) {
                    return i;
                }
            }
            return null ;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * delete a items
     * @param li list of items
     */
    public static void DeleteItems(List<Items> li){
        System.out.println("Enter the reference items to delete:");
        Scanner f = new Scanner(System.in);
        String referenceItems = f.next();

        if (ListItems.FoundItems(referenceItems,li)!=null) {
            li.remove(ListItems.FoundItems(referenceItems,li));
            System.out.println("The items has been deleted. ");

        } else {
            System.out.println("Error: the items is not found in our list users, please enter a reference items valid.");
        }
    }
}
