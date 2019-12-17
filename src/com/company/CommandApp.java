package com.company;

import java.util.List;
import java.util.Scanner;

public class CommandApp {
    public static void CommandMenu() {
        System.out.println("**MENU**");
        System.out.println("'help':display the list of the command app");
        System.out.println("'exit' : exit the app");
        System.out.println("'createPurchasers':create a new purcharsers");
        System.out.println("'createItems': create a new items");
    }

    public static void quitApp() {
        System.out.println("Goodbye");
    }

    public static String keyboardScan() {
        System.out.println("Enter a key : ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next().toLowerCase();
        if(choice.equals("exit")||choice.equals("help")||choice.equals("createpurchasers")||choice.equals("createitems")){
            return choice;
        }else {
            return "Insert a valid command";
        }
    }
    public static void commandsAction(String controllerChoice, List<Purchasers> lP,List<Items> lI,List<Auction> lA) {
        if(controllerChoice.equals("exit")){
            quitApp();
        }else if (controllerChoice.equals("help")){
            CommandMenu();
        }else if (controllerChoice.equals("createpurchasers")){
            ListPurchasers.CreatePurchasers();
        }else if(controllerChoice.equals("createitems")){
            ListItems.CreateItems();
        }
        else {
            System.out.println("unknown command, please insert key valid \n");
            CommandMenu();
        }
    }
}
