package Domain;

public class PrintHeroInfo {
    public void displayHeroDetails(Hero hero) {
        System.out.println("HERO DETAILS");
        System.out.println("Name: " + hero.getName());
        System.out.println("Health: " + hero.getHealth());
        System.out.println("Type: " + hero.getType());
    }
}
