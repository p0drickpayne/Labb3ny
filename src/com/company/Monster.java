package com.company;

public class Monster extends Fighter {
    private String name;
    private int exp = 10;


    public Monster(int hp, int atkDmg) {
        super(hp, atkDmg);
    }
    public int dropExp()    {
        return exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
