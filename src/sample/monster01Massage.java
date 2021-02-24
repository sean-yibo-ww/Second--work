package sample;

import java.util.Scanner;

public class monster01Massage {
    private String name01;
    private int life01;
    private int attack01;

    public static String monster01name(){
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        return name;
    }
    public static int monster01life(){
        Scanner scanner=new Scanner(System.in);
        int life=scanner.nextInt();
        return life;
    }
    public static int monster01attack(){
        Scanner scanner=new Scanner(System.in);
        int attack=scanner.nextInt();
        return attack;
    }

    public String getName01() {
        return name01;
    }

    public void setName01(String name01) {
        this.name01 = name01;
    }

    public int getLife01() {
        return life01;
    }

    public void setLife01(int life01) {
        this.life01 = life01;
    }

    public int getAttack01() {
        return attack01;
    }

    public void setAttack01(int attack01) {
        this.attack01 = attack01;
    }
}
