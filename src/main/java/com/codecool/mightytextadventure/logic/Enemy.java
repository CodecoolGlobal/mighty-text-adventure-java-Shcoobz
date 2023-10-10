package com.codecool.mightytextadventure.logic;

public class Enemy {
    private String name;
    private int HP;
    private int attackStrength;

    public Enemy(String name, int HP, int attackStrength) {
        this.name = name;
        this.HP = HP;
        this.attackStrength = attackStrength;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void takeDamage(int damage) {
        HP -= damage;
        if (HP < 0) {
            HP = 0;
        }
    }
}

