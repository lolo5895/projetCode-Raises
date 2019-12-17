package com.company;

public class Purchasers {
    private String firstName;
    private String lastName;
    private String countryBorn;
    private int age;
    private String purchasersSpeciality;

    public Purchasers(String f,String l, String c,int a,String p){
        this.firstName = f;
        this.lastName = l;
        this.countryBorn = c;
        this.age = a;
        this.purchasersSpeciality = p;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getCountryBorn(){
        return this.countryBorn;
    }
    public int getAge(){
        return this.age;
    }
    public String getPurchasersSpeciality(){
        return this.purchasersSpeciality;
    }
    public String setFirstName(){
        return this.firstName;
    }
    public String setLastName(){
        return this.lastName;
    }
    public String setCountryBorn(){
        return this.countryBorn;
    }
    public int setAge(){
        return this.age;
    }
    public String setPurchasersSpeciality(){
        return this.purchasersSpeciality;
    }

    @Override
    public String toString() {
        return "Purchasers{" +
                "firstName ='" + firstName + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", countryBorn ='" + countryBorn + '\'' +
                ", age =" + age +"years"+
                ", purchasersSpeciality ='" + purchasersSpeciality + '\'' +
                '}';
    }
}
