package com.s14Monster;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll("Jane", 100,15.4);
        Minion minion = new Minion("Red Minion", 25,5.5);
        Champion pyke = new Champion("Pyke", 225,100.0);

        System.out.println("Troll's attack damage: " + troll.attack());
        System.out.println("Minion's attack damage: " + minion.attack());
        System.out.println("Pyke's attack damage: " + pyke.attack());
    }

}
