package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int health, int damage) {
        super(health, damage);
    }

    public String printinfo() {
        return "Health " + getHealth() + " \nDamage " + getDamage() + " \nNameWeapon " + weapon.getNameWeapon() + " \nTypeWeapon " + weapon.getTypeWeapon();
    }
}
