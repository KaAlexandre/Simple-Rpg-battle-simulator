package Domain;

import java.util.Objects;
import java.util.Scanner;

public class Battle {
    private Scanner scanner;

    public Battle() {
        this.scanner = new Scanner(System.in);
    }

    public void startBattle(Hero hero, Monster monster) {
        if (hero.getName() == null || hero.getType() == null) {
            System.out.println("Invalid hero type!");
            return;
        }

        System.out.println("A wild " + monster.getName() + " appeared!");
        System.out.println(" ");
        while (hero.getHealth() > 0 && monster.getHealth() > 0) {
            hero.attack(monster);
            if (monster.getHealth() <= 0) {
                System.out.println(" ");
                System.out.println("The " + monster.getName() + " was defeated!");
                break;
            }
            monster.monsterAttack(hero);
            if (hero.getHealth() <= 0) {
                System.out.println(" ");
                System.out.println(hero.getName() + " was defeated...");
                break;
            }
            System.out.println("Do you want to continue the battle? (yes/no)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("The battle was ended.");
                break;
            }
        }
    }
}
