package com.company;

import java.util.List;
import java.util.Scanner;

public class LIstAuction {
    /**
     * create a new auction
     * @param la list of auction
     */
    public static void CreateAuction(List<Auction>la){
        System.out.println("Please enter 'auction'");
        Scanner sc0 = new Scanner(System.in);
        String choiceClass = sc0.next().toLowerCase();
        if(choiceClass.equals("auction")){
            System.out.println("Enter a firstName : ");
            Scanner sc = new Scanner(System.in);
            String choiceFirstName = sc.next().toLowerCase();
            System.out.println("Enter a lastName : ");
            Scanner sc1 = new Scanner(System.in);
            String choiceLastName = sc1.next().toLowerCase();
            System.out.println("Enter a reference items : ");
            Scanner sc2 = new Scanner(System.in);
            String referenceItems = sc2.next().toLowerCase();
            System.out.println("Enter a date auction : ");
            Scanner sc3 = new Scanner(System.in);
            String dateAuction = sc3.next().toLowerCase();
            System.out.println("Enter the date of payment : ");
            Scanner sc4 = new Scanner(System.in);
            String datePayAuction = sc4.next().toLowerCase();
            Auction a = new Auction(choiceFirstName,choiceLastName,referenceItems,dateAuction,datePayAuction);
            la.add(a);
            System.out.println(a);
        }
    }

    /**
     * display the list of auction
     * @param la list of auction
     */
    public static void DisplayAuction(List<Auction>la){
        if(la.isEmpty()){
            System.out.println("List empty");
        }else
            for (int i = 0;i<la.size();i++){
                Auction a = la.get(i);
                System.out.println(a);
            }
    }
}
