package sample;

import java.util.Scanner;

public class monster02Massage {
    private String name02;
    private int life02;
    private int attack02;

    public static String monster02name(){
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        return name;
    }
    public static int monster02life(){
        Scanner scanner=new Scanner(System.in);
        int life=scanner.nextInt();
        return life;
    }
    public static int monster02attack(){
        Scanner scanner=new Scanner(System.in);
        int attack=scanner.nextInt();
        return attack;
    }

    public String getName02() {
        return name02;
    }

    public void setName02(String name02) {
        this.name02 = name02;
    }

    public int getLife02() {
        return life02;
    }

    public void setLife02(int life02) {
        this.life02 = life02;
    }

    public int getAttack02() {
        return attack02;
    }

    public void setAttack02(int attack02) {
        this.attack02 = attack02;
    }
}
