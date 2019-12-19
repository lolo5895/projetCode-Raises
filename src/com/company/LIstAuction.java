package com.company;

import java.util.List;
import java.util.Scanner;

public class LIstAuction {
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
        }
    }
}
