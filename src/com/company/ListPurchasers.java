package com.company;

import java.util.List;
import java.util.Scanner;

public class ListPurchasers {
    public static void CreatePurchasers(List<Purchasers> lp) {
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
            lp.add(p1);
            System.out.println(p1);

        }
    }

   /* public static Purchasers ModifyPurchasers(List<Purchasers> lp){
return null;
    }*/

    public static Purchasers FoundPurchasers(String firstName, String lastName, List<Purchasers>lp){
        try {
            for (Purchasers purchasers : lp) {
                if (purchasers.getFirstName().equals(firstName) && purchasers.getLastName().equals(lastName)) {
                    return purchasers;
                }
            }
            return null ;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static void DeletePurchasers(List<Purchasers> lp){
        System.out.println("Enter the fisrt name purchasers to delete:");
        Scanner f = new Scanner(System.in);
        String firstName = f.next();
        System.out.println("Enter the last name purchasers to delete:");
        Scanner l = new Scanner(System.in);
        String lastName = l.next();

        if (ListPurchasers.FoundPurchasers(firstName, lastName, lp)!=null) {
            lp.remove(ListPurchasers.FoundPurchasers(firstName, lastName, lp));
            System.out.println("The purchasers has been deleted. ");

        } else {
            System.out.println("Error: the purchasers is not found in our list users, please enter a purchasers valid.");
        }
    }
}
