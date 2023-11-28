package com.s14Monster;

public class Champion extends Monster implements Bleedable, Posionable{
    public Champion(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }
    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}
