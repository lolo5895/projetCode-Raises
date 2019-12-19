package com.company;

import java.util.List;
import java.util.Scanner;

public class ListPurchasers {
    /**
     *create a new purchasers but only authorizes the creation of a buyer whose age is between 18 and 99 and checks that there is not
     * the same buyer twice
     * @param lp list of purchasers
     */
    public static void CreatePurchasers(List<Purchasers> lp) {
        System.out.println("Please enter 'purchasers'");
        Scanner sc0 = new Scanner(System.in);
        String choiceClass = sc0.next().toLowerCase();
        if (choiceClass.equals("purchasers")) {
            String choiceFirstName;
            String choiceLastName;
            boolean PurchaserExist = false;
            do {
                System.out.println("Enter a firstName : ");
                Scanner sc = new Scanner(System.in);
                choiceFirstName = sc.next().toLowerCase();
                System.out.println("Enter a lastName : ");
                Scanner sc1 = new Scanner(System.in);
                choiceLastName = sc1.next().toLowerCase();
                if (ListPurchasers.FoundPurchasers(choiceFirstName, choiceLastName, lp)!=null) {
                    System.out.println("The purchasers exists, please try again ");
                } else {
                    PurchaserExist = true;
                }
            }while (PurchaserExist == false);
            System.out.println("Enter a countryBorn : ");
            Scanner sc2 = new Scanner(System.in);
            String choiceCountryBorn = sc2.next().toLowerCase();
           int choiceAge = 0;
           do{
               try{
                   System.out.println("Enter age : ");
                   Scanner sc3 = new Scanner(System.in);
                   choiceAge = Integer.parseInt(sc3.next());
                   if(choiceAge<18||choiceAge>99){
                       System.out.println("Please enter an age between 18 and 99"+"\n");
                   }
               }catch(NumberFormatException e){
                   System.out.println("Please enter an age between 18 and 99");
                   e.getMessage();
               }
           }while (choiceAge < 18 || choiceAge > 99);
            System.out.println("Enter a speciality : ");
            Scanner sc4 = new Scanner(System.in);
            String choiceSpeciality = sc4.next().toLowerCase();

            Purchasers p1 = new Purchasers(choiceFirstName, choiceLastName, choiceCountryBorn, choiceAge, choiceSpeciality);
            lp.add(p1);
            System.out.println(p1);
        }
    }

    /**
     * display the list of purchasers
     * @param lp list of purchasers
     */
    public static void DisplayPurchasers(List<Purchasers>lp){
        if(lp.isEmpty()){
            System.out.println("List empty");
        }else
        for (int i = 0;i<lp.size();i++){
            Purchasers p = lp.get(i);
            System.out.println(p);
        }
    }

   /* public static void ModifyPurchasers(List<Purchasers> lp){
        System.out.println("Enter the fisrt name purchasers to change : ");
        Scanner f = new Scanner(System.in);
        String firstName = f.next();
        System.out.println("Enter the last name purchasers to change : ");
        Scanner l = new Scanner(System.in);
        String lastName = l.next();
        if (ListPurchasers.FoundPurchasers(firstName, lastName, lp)!=null) {
            Purchasers modifp = FoundPurchasers(firstName, lastName, lp);
            System.out.println(modifp);
            System.out.println("Enter a countryBorn : ");
            Scanner sc2 = new Scanner(System.in);
            String NewCountryBorn = sc2.next().toLowerCase();
            if (NewCountryBorn.equals("")){
                modifp.getCountryBorn();
            }else{
                modifp.setCountryBorn(NewCountryBorn);

            }
        } else {
            System.out.println("Error: the purchasers is not found in our list users, please enter a purchasers valid.");
        }

    }*/

    /**
     * look for an purchasers with first name and last name
     * @param firstName
     * @param lastName
     * @param lp
     * @return a purchasers
     */
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

    /**
     *delete a purchasers
     * @param lp list of purchasers
     */
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
