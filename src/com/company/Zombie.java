package com.company;

public class Zombie extends Monster {
    public Zombie(int hp, int atkDmg, String name) {
        super(hp, atkDmg);

    }

    public String battleShout()   {
        return "Braaaaains!!......";
    }

}
