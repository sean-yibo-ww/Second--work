package sample;

import static sample.playerMassage.playername;
import static sample.playerMassage.playerlife;
import static sample.playerMassage.playerattack;
import static sample.playerMassage.playerdefense;

import static sample.monster01Massage.monster01name;
import static sample.monster01Massage.monster01life;
import static sample.monster01Massage.monster01attack;

import static sample.monster02Massage.monster02name;
import static sample.monster02Massage.monster02life;
import static sample.monster02Massage.monster02attack;

public class Game {
    public static void main(String[] args) {
        System.out.println("主角的属性：");
        System.out.println("请输入主角名称：");
        String names=playername();
        System.out.println("请输入主角的生命值(1~999)：");
        int playeralllife = playerlife();
        System.out.println("请输入主角的攻击力(1~999)：");
        int playerattacks = playerattack();
        System.out.println("请输入主角的防御力(1~999)：");
        int playerdefenses = playerdefense();

        System.out.println("怪兽01的属性：");
        System.out.println("请输入怪兽01的名称：");
        String name01=monster01name();
        System.out.println("请输入怪兽01的生命值(1~999)：");
        int monster01alllife = monster01life();
        System.out.println("请输入怪兽01的攻击力(1~999)：");
        int monsterattack01 = monster01attack();

        System.out.println("怪兽02的属性：");
        System.out.println("请输入怪兽02名称：");
        String name02=monster02name();
        System.out.println("请输入怪兽02的生命值(1~999)：");
        int monster02alllife = monster02life();
        System.out.println("请输入怪兽02的攻击力(1~999)：");
        int monsterattack02 = monster02attack();

        int frequency=0;
        System.out.println("The battle with "+name01+" begins now!");
        if (playerattacks - monster01alllife >= 0) {
            frequency++;
            System.out.println("Congradulation! The battle with "+name02+" begins now!"+"回合数为："+"\t"+frequency);
            System.out.println(names+"的血量还有："+playeralllife);
            System.out.println(name02+"的血量有："+monster02alllife);
            for(frequency=2;;frequency++){
                System.out.println("第"+frequency+"局进攻");
                monster02alllife=monster02alllife-playerattacks;
                System.out.println(names+"的血量还有："+playeralllife);
                System.out.println(name02+"的血量还有："+monster02alllife);
                if(playeralllife>0 && monster02alllife>0){
                    System.out.println("第"+frequency+"局"+name02+"反击：");
                    playeralllife=playeralllife-monsterattack02+playerdefenses;
                    System.out.println(names+"的血量还有："+playeralllife);
                    System.out.println(name02+"的血量还有："+monster02alllife);
                }
                if(playeralllife>=0 && monster02alllife<=0){
                    System.out.println("Victory!!!"+"\n"+names+"剩余血量为："+playeralllife+"\n"+"回合数为："+frequency);
                    break;
                }else if(playeralllife<=0 && monster02alllife>=0){
                    System.out.println("Defeat!!!"+"\n"+name02+"剩余血量为："+monster02alllife+"\n"+"回合数为："+frequency);
                    break;
                }
            }
        }else {
            frequency++;
            System.out.println(names+"的血量有："+playeralllife);
            System.out.println(name01+"的血量有："+monster01alllife);
            for(frequency=2;;frequency++){
                System.out.println("第"+frequency+"局进攻");
                monster01alllife=monster01alllife-playerattacks;
                System.out.println(names+"的血量还有："+playeralllife);
                System.out.println(name01+"的血量还有："+monster01alllife);
                if(playeralllife>0 && monster01alllife>0){
                    System.out.println("第"+frequency+"局"+name01+"反击：");
                    playeralllife=playeralllife-monsterattack01+playerdefenses;
                    System.out.println(names+"的血量还有："+playeralllife);
                    System.out.println(name01+"的血量还有："+monster01alllife);
                }
                if(playeralllife>=0 && monster01alllife<=0){
                    System.out.println("Victory!!!"+"\n"+names+"剩余血量为："+playeralllife+"\n"+"回合数为："+frequency);
                    break;
                }else if(playeralllife<=0 && monster01alllife>=0){
                    System.out.println("Defeat!!!"+"\n"+name01+"剩余血量为："+monster01alllife+"\n"+"回合数为："+frequency);
                    break;
                }
            }
        }
    }
}