package sample;

import java.util.Scanner;

public class playerMassage {
    private String name;
    private int life;
    private int attack;
    private int defense;

    public static String  playername(){
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        return name;
    }
    public static int playerlife(){
        Scanner scanner=new Scanner(System.in);
        int life=scanner.nextInt();
        return life;
    }
    public static int playerattack(){
        Scanner scanner=new Scanner(System.in);
        int attack=scanner.nextInt();
        return attack;
    }
    public static int playerdefense(){
        Scanner scanner=new Scanner(System.in);
        int defense=scanner.nextInt();
        return defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
