package com.company;

public class Tower {
    public String location;
    public String condition;
    public int years;
    public double price;

    @Override
    public String toString() {
        return  "Tower location is " + location + ".\n" + "Tower condition is " + condition + ".\n" + "Tower age is " + years + ".\n" + "Tower price is " + price +".\n";
    }
}
