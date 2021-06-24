package com.company;

public class Building {
    public String location;
    public String condition;
    public int years;
    public double price;

    // конструктор
    public Building(String location, String condition, int years, double price) {
        this.location = location;
        this.condition = condition;
        this.years = years;
        this.price = price;


    }// Метод с описанием объекта

    public void getInfo() {

        System.out.println("Building location is " + location + ".\n" + "Building condition is " + condition + ".\n" + "Building age is " + years + ".\n" + "Building price is " + price + ".\n");
    }
}
