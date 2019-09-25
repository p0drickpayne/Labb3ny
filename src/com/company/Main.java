package com.company;
import javax.crypto.spec.PSource;
//import javax.xml.catalog.GroupEntry;
import java.util.Random;
import java.util.Scanner;
public class Main {

    /*
    To do:
    Kolla klart på Tim ang. arrayer
    försök skapa shop....
    lololololololol
     */

    public static void main(String[] args) {

        Random rando = new Random();
        Scanner sc = new Scanner(System.in);


        String playerName = enterName(sc);
        Player player = new Player(playerName, 20, 7);


        menu(sc, player, rando);





    }
    public static void menu(Scanner sc, Player player, Random rando) {

        while (true) {
            int number = rando.nextInt(10) + 1;
            //lägg in IF (du har gått på adventure eller kollat din gubbe) skriv "What would you like to do now?"
            System.out.println("What would you like to do? ");
            System.out.println("1. Go adventuring");
            System.out.println("2. Show details about your character");
            System.out.println("e. exit");

            char choice = sc.next().charAt(0);

            switch (choice) {
                case '1':
                    if (number <= 10) {
                        adventure(player);
                    } else System.out.println("You see nothing but swaying grass around you");
                    break;
                case '2':
                    showPlayerStats(player);
                    break;
                case 'e':
                    System.out.println("See you again ");

                default:
                    return;
            }
            if (player.getLevel() == 10)    {
                System.out.println("You won the game");
                return;
            }
        }

    }
    public static String enterName(Scanner sc){
        System.out.println("Welcome to the game");
        System.out.println("Please enter your name ");
        String playerName = sc.nextLine();
        return playerName;

    }

    public static void adventure(Player player) {
        /*
        Skapa en metod som gör att det är 10% chans att inget händer.
        Random bound 10?
         */
        Zombie zombie = new Zombie(5, 5, "Zombie");
        System.out.println("A dreadful Zombie appears.. It says "+ zombie.battleShout());
        Fighter winner = player.fightToTheDeath(zombie);

        if (winner instanceof  Monster) {
            // Betyder att vinnaren var ett monster och spelaren dog. Vi ska exit
            System.out.println("UhOh, you died");

            System.exit(0);
        }
        System.out.println("Damn you smacked that monsters ass");

        int exp = zombie.dropExp();
        player.collectExp(exp);

    }
    public static void showPlayerStats(Player player)   {
        System.out.println("Your Name: " + player.getPlayerName());
        System.out.println("Your HP: " + player.getHp());
        System.out.println("Your EXP: " + player.getExp());
        System.out.println("Your Level: " + player.getLevel());
    }
//    public static int randoCalrissian(Random rando, number) {
//
//       number = rando.nextInt(10+1);
//       return number;
//    }
}