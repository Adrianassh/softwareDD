package prove02;

import java.awt.*;
import java.util.Random;

public class Zombie extends Creature implements Movable, Aggressor{

    Random _rand;

    public Zombie() {
        _rand = new Random();
        _health = 1;
    }

    @Override
    Shape getShape() {
        return Shape.Square;
    }

    @Override
    Color getColor() {
        return new Color(9, 70, 213); }

    @Override
    Boolean isAlive() {
        return _health > 0;
    }

    @Override
    public void attack(Creature target) {
        if(target instanceof Animal) {
            target.takeDamage(10);
        }
    }

    @Override
    public void move() {
        switch(_rand.nextInt(1)) {
            case 0:
                _location.x++;
                break;
            default:
                break;
        }
    }

}
