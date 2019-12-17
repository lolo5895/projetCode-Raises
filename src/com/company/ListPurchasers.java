package com.company;

import java.util.Scanner;

public class ListPurchasers {
    public static Purchasers CreatePurchasers() {
        System.out.println("Please enter 'purchasers'");
        Scanner sc0 = new Scanner(System.in);
        String choiceClass = sc0.next().toLowerCase();
        if (choiceClass.equals("purchasers")) {
            System.out.println("Enter a firstName : ");
            Scanner sc = new Scanner(System.in);
            String choiceFirstName = sc.next().toLowerCase();
            System.out.println("Enter a lastName : ");
            Scanner sc1 = new Scanner(System.in);
            String choiceLastName = sc1.next().toLowerCase();
            System.out.println("Enter a countryBorn : ");
            Scanner sc2 = new Scanner(System.in);
            String choiceCountryBorn = sc2.next().toLowerCase();
            System.out.println("Enter age : ");
            Scanner sc3 = new Scanner(System.in);
            int choiceAge = Integer.parseInt(sc3.next());
            System.out.println("Enter a speciality : ");
            Scanner sc4 = new Scanner(System.in);
            String choiceSpeciality = sc4.next().toLowerCase();

            Purchasers p1 = new Purchasers(choiceFirstName, choiceLastName, choiceCountryBorn, choiceAge, choiceSpeciality);
            System.out.println(p1);
            return p1;

        }return CreatePurchasers();
    }
}
