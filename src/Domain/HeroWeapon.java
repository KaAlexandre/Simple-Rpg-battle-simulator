package Domain;

public class HeroWeapon {
    public void weapon(Hero hero) {
        switch (hero.getType()) {
            case "Mage":
            case "mage":
                hero.setWeapon("Dark wand");
                break;
            case "Warrior":
            case "warrior":
                hero.setWeapon("Blood axe");
                break;
            case "Monk":
            case "monk":
                hero.setWeapon("Electric claw");
                break;
        }
    }
}
