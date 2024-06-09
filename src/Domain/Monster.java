package Domain;

import java.util.Random;

public class Monster {
    private String name;
    private int health;

    public Monster() {
        setMonsterData();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void monsterAttack(Hero hero) {
        Random rand = new Random();
        int damage = rand.nextInt(15) + 1;
        System.out.println(" ");
        System.out.println("The " + name + " attacked " + hero.getName() + " and dealt " + damage + " damage.");
        hero.takeDamage(damage);
    }

    public void decreaseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println(" ");
            System.out.println(this.name + " died!");
        } else {
            System.out.println(" ");
            System.out.println(this.name + " has " + this.health + " health remaining");
        }
    }

    private void setMonsterData() {
        Random rand = new Random();
        name = "genericMonster";
        health = rand.nextInt(27) + 18;
    }
}
