package Domain;

public class Hero {
    private String name;
    private int health;
    private String type;
    private String weapon;

    private boolean isValidHeroType(String type) {
        return type.equalsIgnoreCase("Mage") || type.equalsIgnoreCase("Warrior") || type.equalsIgnoreCase("Monk");
    }
    public Hero(String name, String type) {
        this.name = name;
        if (isValidHeroType(type)) {
            this.type = type;
            HeroLifeDetails lifeDetails = new HeroLifeDetails();
            lifeDetails.health(this);
            HeroWeapon heroWeapon = new HeroWeapon();
            heroWeapon.weapon(this);
        } else {
            return;
        };
        this.type = type;
        HeroLifeDetails lifeDetails = new HeroLifeDetails();
        lifeDetails.health(this);
        HeroWeapon heroWeapon = new HeroWeapon();
        heroWeapon.weapon(this);
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    public void attack(Monster monster) {
        HeroAttackDetails attackDetails = new HeroAttackDetails();
        int damage = attackDetails.attackTypes(this);
        monster.decreaseHealth(damage);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println(" ");
            System.out.println(this.name + " died!");
        } else {
            System.out.println(" ");
            System.out.println(this.name + " has " + this.health + " health remaining");
        }
    }
}
