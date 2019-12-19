package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Restore {

    public static void Restore(List<Purchasers>lp,List<Items>li,List<Auction>la) throws IOException {
        System.out.println("wich list you want to restore?"+"\n"+"Please enter 'restore'+the name of the list choice"+"\n"+
                "Purchasers?"+"\n"+"Items?"+"\n"+"Auction?");
        try {
            Scanner sc0 = new Scanner(System.in);
            String choiceClass = sc0.next().toLowerCase();
            if (choiceClass.equals("restorepurchasers")) {
                Restore.RestorePurchasers(lp);
            } else if (choiceClass.equals("restoreitems")) {
                Restore.RestoreItems(li);
            } else if (choiceClass.equals("restoreauction")) {
                Restore.RestoreAuction(la);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void RestoreItems(List<Items> li) throws IOException {
        try {
            FileReader f = new FileReader("ListItems.txt");
            for (int i = 0; i < li.size(); i++) {
                f.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Purchasers>  RestorePurchasers(List<Purchasers> lp) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ListPurchasers.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                String[]lt = line.split(";");
                Purchasers p = new Purchasers(lt[0],lt[1],lt[2],Integer.parseInt(lt[3]),lt[4]);
                lp.add(p);
            }
            reader.close();
            return lp;
        } catch (IOException e) {
            System.err.format("Exception occurred trying to read '%s'.", "ListPurchasers.txt");
            e.printStackTrace();
            return null;
        }
    }

    public static List<Auction> RestoreAuction(List<Auction> la) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ListAuction.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                String[]lt = line.split(";");
                Auction a = new Auction(lt[0],lt[1],lt[2],lt[3],lt[4]);
                la.add(a);
            }
            reader.close();
            return la;
        } catch (IOException e) {
            System.err.format("Exception occurred trying to read '%s'.", "ListAuction.txt");
            e.printStackTrace();
            return null;
        }
    }
}
