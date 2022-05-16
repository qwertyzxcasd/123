package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(200, 50);
        boss.weapon.setNameWeapon("ak-47");
        boss.weapon.setTypeWeapon("gunshot");
        System.out.println(boss.printinfo());
        Skeleton skeleton = new Skeleton(200, 50, 25);
        skeleton.weapon.setNameWeapon("ak-47");
        skeleton.weapon.setTypeWeapon("gunshot");
        System.out.println("---------------------");
        System.out.println(skeleton.printinfo());
        Skeleton skeleton1 = new Skeleton(200, 50, 30);
        skeleton1.weapon.setNameWeapon("ak-47");
        skeleton1.weapon.setTypeWeapon("gunshot");
        System.out.println("---------------------");
        System.out.println(skeleton1.printinfo());

    }
}
