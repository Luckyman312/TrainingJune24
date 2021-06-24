package com.company;

import java.awt.desktop.AboutEvent;

public class Main {

    public static void main(String[] args) {
    Building building = new Building("","",200,200000);
    building.location = "London";
    building.condition = "Good";
    building.years = 200;
    building.price = 200000;
    building.getInfo();

        System.out.println("------");

    Tower tower = new Tower();
    tower.location = "Dublin";
    tower.condition = "Poor";
    tower.years = 300;
    tower.price = 100000;

        System.out.println(tower.toString());

        System.out.println("------");

    Castle castle = new Castle();
    castle.location = "Edinburgh";
    castle.condition = "Very good";
    castle.years = 200;
    castle.price = 500000;
    castle.getAllInfo();

        System.out.println("------");

    TownHouse townHouse = new TownHouse();
    townHouse.setLocation("Bishkek");
    townHouse.setCondition("Excellent");
    townHouse.setYears(1);
    townHouse.setPrice(200000);
    townHouse.getAllInfoTownHouse();
    }

}
