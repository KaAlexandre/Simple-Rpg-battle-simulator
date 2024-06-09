package Test;

import Domain.*;

import java.util.Scanner;

public class BattleTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the name of your hero");
        String heroName = scanner.nextLine();
        System.out.println("Insert the type of your hero (Mage, Warrior or Monk)");
        String heroType = scanner.nextLine();

        Hero hero = new Hero(heroName, heroType);
        Monster monster = new Monster();
        Battle battle = new Battle();
        PrintHeroInfo printHeroInfo = new PrintHeroInfo();
        printHeroInfo.displayHeroDetails(hero);
        battle.startBattle(hero, monster);
    }

}
