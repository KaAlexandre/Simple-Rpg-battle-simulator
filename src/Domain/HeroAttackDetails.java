package Domain;

import java.util.Random;

public class HeroAttackDetails {
    public int attackTypes(Hero hero) {
        Random rand = new Random();
        int damage = 0;
        switch (hero.getType()) {
            case "Mage":
            case "mage":
                damage = rand.nextInt(18) + 4;
                System.out.println("The " + hero.getType() + " attacked using shadow magic");

                break;
            case "Warrior":
            case "warrior":
                damage = rand.nextInt(20) + 8;
                System.out.println("The " + hero.getType() + " attacked using devastating cut");

                break;
            case "Monk":
            case "monk":
                damage = rand.nextInt(15) + 5;
                System.out.println("The " + hero.getType() + " attacked using martial arts");

                break;
            default:
                System.out.println("There isn't this type of hero");
        }
        return damage;
    }
}
