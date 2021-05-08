package teach03;

import java.io.Serializable;

public class Player implements Serializable {

    String name;
    int mana;
    int health;
    int gold;

    public Player(String name, int mana, int health, int gold) {
        this.name = name;
        this.mana = mana;
        this.health = health;
        this.gold = gold;
    }

    public void display() {
        System.out.println("N   ame: " + name );
        System.out.println("Mana: " + mana );
        System.out.println("Health: " + health );
        System.out.println("Gold: " + gold );
    }
}