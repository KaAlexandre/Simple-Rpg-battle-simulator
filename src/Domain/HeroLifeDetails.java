package Domain;

public class HeroLifeDetails {
    public void health(Hero hero) {
        switch (hero.getType()) {
            case "Mage":
            case "mage":
                hero.setHealth(24);
                break;
            case "Warrior":
            case "warrior":
                hero.setHealth(30);
                break;
            case "Monk":
            case "monk":
                hero.setHealth(27);
                break;
        }
    }
}
