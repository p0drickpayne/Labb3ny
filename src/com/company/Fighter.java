
package com.company;
import java.util.Random;
import java.util.Scanner;

public abstract class Fighter {
    int hp;
    int atkDmg;
    Random rando = new Random();
    Scanner sc= new Scanner(System.in);


    public Fighter(int hp, int atkDmg) {
        this.hp= hp;
        this.atkDmg = atkDmg;
    }

    public void attack(Fighter opponent) {
        opponent.takeDmg(atkDmg);
    }

    public void takeDmg(int dmg) {
        this.setHp(this.getHp() - dmg);
    }
    public boolean isDead() {
        if (hp <= 0) {
            return true;
        } else return false;

    }

    /**
     * Opponent = another fighter that you can fight
     * this = the initiator of the fight which in this case is the Player -> player.fightToTheDeath(zombie)
     * @param opponent
     * @return The winner of the fight
     */
    public Fighter fightToTheDeath(Fighter opponent)   {

        while (true)   {
//            System.out.println("Would you lik to hit " + "? Y/N.");
//            char answer = sc.next().charAt(0);
//            if (answer == 'y') {
            System.out.println("Do you want to hit yor opponent? ");
            System.out.println("Please press enter: "); System.out.println(sc.nextLine());
            this.attack(opponent);
            System.out.println(" attack the monster for: " + this.atkDmg + " damage.");
            System.out.println("The monster now has " + opponent.getHp() + " HP left.");
            if (opponent.isDead()) {
                //Genom att returnera något så "breakar" vi while loopen
                return this;
            }
            opponent.attack(this);
            System.out.println("The Monster then attacks you for: " + opponent.atkDmg + " damage.");
            System.out.println("You now have: " + this.getHp() + " HP left.");
            if (this.isDead()) {
                return opponent;
            }
//            }
        }
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getName(){
        return Player.class.getName();
    }
}
