package com.company;

public class Auction {
    private String lastNamePurchasers;
    private String firstNamePurchasers;
    private String referenceItems;
    private String dayAuction;
    private String payDayAuction;


    public Auction(String l, String f, String r ,String d, String p){
        this.lastNamePurchasers = l;
        this.firstNamePurchasers = f;
        this.referenceItems = r;
        this.dayAuction = d;
        this.payDayAuction = p;
    }
    public String getLastNamePurchasers(){
        return this.lastNamePurchasers;
    }
    public String getFirstNamePurchasers(){
        return this.firstNamePurchasers;
    }
    public String getReferenceItems(){
        return this.referenceItems;
    }
    public String getDayAuction(){
        return this.dayAuction;
    }
    public String getPayDayAuction(){
        return this.payDayAuction;
    }
    public String setLastNamePurchasers(){
        return this.lastNamePurchasers;
    }
    public String setFirstNamePurchasers(){
        return this.firstNamePurchasers;
    }
    public String setReferenceItems(){
        return this.referenceItems;
    }
    public String setDayAuction(){
        return this.dayAuction;
    }
    public String setPayDayAuction(){
        return this.payDayAuction;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "lastNamePurchasers='" + lastNamePurchasers + '\'' +
                ", firstNamePurchasers='" + firstNamePurchasers + '\'' +
                ", referenceItems='" + referenceItems + '\'' +
                ", dayAuction='" + dayAuction + '\'' +
                ", payDayAuction='" + payDayAuction + '\'' +
                '}';
    }
}
