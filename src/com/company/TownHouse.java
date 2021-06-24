package com.company;

public class TownHouse {
    private String location;
    private String condition;
    private int years;
    private double price;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public  void getAllInfoTownHouse(){
        System.out.println("Townhouse location is " + location + ".\n" + "Townhouse condition is " + condition + ".\n" + "Townhouse age is " + years + ".\n" + "Tounhouse price is " + price + ".\n");
    }
}
