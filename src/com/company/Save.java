package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Save {
    public static void Save(List<Purchasers>lp,List<Items>li,List<Auction>la){
        System.out.println("wich list you want to save?"+"\n"+"Please enter 'save'+the name of the list choice"+"\n"+"Purchasers?"+"\n"+"Items?"+"\n"+"Auction?");
        Scanner sc0 = new Scanner(System.in);
        String choiceClass = sc0.next().toLowerCase();
        if(choiceClass.equals("savepurchasers")){
            Save.SavePurchasers(lp);
        }else if(choiceClass.equals("saveitems")){
            Save.SaveItems(li);
        }else if (choiceClass.equals("saveauction")){
            Save.SaveAuction(la);
        }
    }
    public static void SavePurchasers(List<Purchasers> lp){
        try {
            FileWriter fileWriter = new FileWriter("ListPurchasers.txt");
            for (int i = 0;i<lp.size();i++){
                Purchasers p = lp.get(i);
                fileWriter.write( p.getFirstName()+";"+p.getLastName()+";"+p.getCountryBorn()+";"+p.getAge()+";"+p.getPurchasersSpeciality()+"\n");
            }
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void SaveItems(List<Items> li){
        try {
            FileWriter fileWriter = new FileWriter("ListItems.txt");
            for (int i = 0;i<li.size();i++){
                Items items = li.get(i);
                fileWriter.write( items.getNameItems()+";"+items.getReference()+";"+items.getCategory()+";"+ items.getScarcity()+"%"+"\n");
            }
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void SaveAuction(List<Auction> la){
        try {
            FileWriter fileWriter = new FileWriter("ListAuction.txt");
            for (int i = 0;i<la.size();i++){
                Auction a = la.get(i);
                fileWriter.write( a.getFirstNamePurchasers()+";"+a.getLastNamePurchasers()+ ";"+a.getReferenceItems()+";"+a.getDayAuction()+";"+a.getPayDayAuction()+"\n");
            }
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
