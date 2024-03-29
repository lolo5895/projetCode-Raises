package com.company;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CommandApp {
    /**
     * displays the different functions of the application
     */
    public static void CommandMenu() {
        System.out.println("**MENU**");
        System.out.println("'help':display the list of the command app");
        System.out.println("'exit' : exit the app");
        System.out.println("'createpurchasers':create a new purcharsers");
        System.out.println("'editpurchasers':find a buyer and modify it");
        System.out.println("'removepurchasers': searches for a buyer and deletes it");
        System.out.println("'listpurchasers':display the purchasers list");
        System.out.println("'createitems': create a new items");
        System.out.println("'edititems':find an items and modify it");
        System.out.println("'removeitems':find an items and delete it");
        System.out.println("'listitems':display the items list");
        System.out.println("'createauction': create a new auction");
        System.out.println("'payeauction':display the summary of a completed auction");
        System.out.println("'listauction':display the auction list");
        System.out.println("'save':save the list in file");
        System.out.println("'restore':restore the list of a file after restarting the application ");
    }

    /**
     *quits the application
     */
    public static void quitApp() {
        System.out.println("Goodbye");
    }

    /**
     *retrieve commands written on the keyboard
     * @return the choice user
     * @return a character string to prompt the user to write a valid command
     */
    public static String keyboardScan() {
        System.out.println("Enter a key : ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next().toLowerCase();
        if(choice.equals("exit")||choice.equals("help")||choice.equals("createpurchasers")||choice.equals("createitems")||choice.equals("save")||choice.equals("removepurchasers")
        ||choice.equals("savepurchasers")||choice.equals("saveitems")||choice.equals("saveauction")||choice.equals("restore")
        ||choice.equals("restorepurchasers")||choice.equals("restoreitems")||choice.equals("restoreauction")||choice.equals("listpurchasers")||
        choice.equals("listitems")||choice.equals("removeitems")||choice.equals("createauction")||choice.equals("listauction")||choice.equals("editpurchasers")){
            return choice;
        }else {
            return "Insert a valid command";
        }
    }

    /**
     *allows the user to enter a command
     * @param controllerChoice
     * @param lP list of purchasers
     * @param lI list of items
     * @param lA list of auction
     * @throws IOException
     */
    public static void commandsAction(String controllerChoice, List<Purchasers> lP,List<Items> lI,List<Auction> lA) throws IOException {
        if(controllerChoice.equals("exit")){
            quitApp();
        }else if (controllerChoice.equals("help")){
            CommandMenu();
        }else if (controllerChoice.equals("createpurchasers")){
            ListPurchasers.CreatePurchasers(lP);
        }else if(controllerChoice.equals("createitems")){
            ListItems.CreateItems(lI);
        } else if(controllerChoice.equals("removepurchasers")){
            ListPurchasers.DeletePurchasers(lP);
        } else if(controllerChoice.equals("save")){
            Save.Save(lP,lI,lA);
            System.out.println("file save");
        }else if (controllerChoice.equals("restore")){
            Restore.Restore(lP,lI,lA);
        }else if (controllerChoice.equals("listpurchasers")){
            ListPurchasers.DisplayPurchasers(lP);
        }else if (controllerChoice.equals("listitems")){
            ListItems.DisplayItems(lI);
        }else if (controllerChoice.equals("removeitems")){
            ListItems.DeleteItems(lI);
        }else if (controllerChoice.equals("createauction")){
            LIstAuction.CreateAuction(lA);
        } else if (controllerChoice.equals("listauction")){
            LIstAuction.DisplayAuction(lA);
        }
        else {
            System.out.println("unknown command, please insert key valid \n");
            CommandMenu();
        }
    }
}
