package com.company;

public class Items {
    private String nameItems;
    private String reference;
    private String category;
    private int scarcity;


    public Items(String n, String r, String c, int s){
        this.nameItems = n;
        this.reference = r;
        this.category = c;
        this.scarcity = s;
    }

    public String getNameItems(){
        return this.nameItems;
    }
    public String getReference(){
        return this.reference;
    }
    public String getCategory(){
        return this.category;
    }
    public int getScarcity(){
        return this.scarcity;
    }
    public String setNameItems(){
        return this.nameItems;
    }
    public String setReference(){
        return this.reference;
    }
    public String setCategory(){
        return this.category;
    }
    public int setScarcity(){
        return this.scarcity;
    }


    @Override
    public String toString() {
        return "Items{" +
                "nameItems ='" + nameItems + '\'' +
                ", reference ='" + reference + '\'' +
                ", category ='" + category + '\'' +
                ", scarcity ='" + scarcity +"%"+'\''+
                '}';
    }
}
