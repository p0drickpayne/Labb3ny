package com.company;

public class Player extends Fighter {


    private String playerName;
    private int level = 1;
    private int exp = 10;
    private int gold = 0;


    public Player(String playerName, int hp, int attackDmg) {
        super(hp, attackDmg);
        this.playerName = playerName;

    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public void collectExp(int collectedExp)  {
        exp += collectedExp;
        if (exp >= level*10)  {
            level ++;
            System.out.println("Comgraulations you are now level: " + level);
        }
    }

    public int getExp() {
        return exp;
    }

    public int getLevel() {
        return level;
    }

    //    public void setLevel(int level) {
//        this.level = level;
//    }
    public int getGold()    {
        return gold;
    }
}
