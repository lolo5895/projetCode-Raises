package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SaveAndRestore {
    public static void Save(List<Purchasers>lp,List<Items>li,List<Auction>la){
        System.out.println("wich list you want to save?"+"\n"+"Please enter 'save'+the name of the list choice"+"\n"+"Purchasers?"+"\n"+"Items?"+"\n"+"Auction?");
        Scanner sc0 = new Scanner(System.in);
        String choiceClass = sc0.next().toLowerCase();
        if(choiceClass.equals("savepurchasers")){
            SaveAndRestore.SavePurchasers(lp);
        }else if(choiceClass.equals("saveitems")){
            SaveAndRestore.SaveItems(li);
        }else if (choiceClass.equals("saveauction")){
            SaveAndRestore.SaveAuction(la);
        }
    }
    public static void SavePurchasers(List<Purchasers> lp){
        try {
            FileWriter fileWriter = new FileWriter("ListPurchasers.txt",true);
            for (int i = 0;i<lp.size();i++){
                Purchasers p = lp.get(i);
                fileWriter.write( "First name: "+p.getFirstName()+" "+"Last name: "+p.getLastName()+" "+"Country born:"+p.getCountryBorn()+" "+
                        "Age : "+p.getAge()+" "+"Speciality : "+p.getPurchasersSpeciality()+"\n");
                fileWriter.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void SaveItems(List<Items> li){
        try {
            FileWriter fileWriter = new FileWriter("ListItems.txt");
            for (int i = 0;i<li.size();i++){
                Items items = li.get(i);
                fileWriter.write( "Name items: "+items.getNameItems()+" "+"Reference :"+items.getReference()+" "+"Category : "+items.getCategory()+" "+
                        "Scarcity : "+items.getScarcity()+"\n");
                fileWriter.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void SaveAuction(List<Auction> la){
        try {
            FileWriter fileWriter = new FileWriter("ListAuction.txt");
            for (int i = 0;i<la.size();i++){
                Auction a = la.get(i);
                fileWriter.write( "First name purchasers: "+a.getFirstNamePurchasers()+"Last name purchasers: "+a.getLastNamePurchasers()+ "\n");
                fileWriter.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
