package com.company;

public class Object {
    private String nameObject;
    private String reference;
    private String category;
    private int scarcity;


    public Object(String n,String r,String c,int s){
        this.nameObject = n;
        this.reference = r;
        this.category = c;
        this.scarcity = s;
    }

    public String getNameObject(){
        return this.nameObject;
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
}
