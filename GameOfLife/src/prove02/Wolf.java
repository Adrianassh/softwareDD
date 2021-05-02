package prove02;

import java.awt.*;
import java.util.Random;

public class Wolf extends Creature implements Movable, Aware, Aggressor, Spawner {

    Random _rand;
    int _direction;
    Boolean _firstMove;
    Boolean _neighbors;

    public Wolf() {
        _rand = new Random();
        _health = 1;
        _direction = 0;
        _firstMove = false;
        _neighbors = false;
    }

    @Override
    public void attack(Creature target) {
        if(target instanceof Animal) {
            target.takeDamage(5);
        }
    }

    @Override
    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {

        if (_firstMove) {
            switch (_direction) {
                case 0:
                    _neighbors = true;
                    if (right != null && right._location.x - _location.x == 1) {
                        _location.x++;
                    } else if (below != null && _location.y - below._location.y == 1) {
                        _location.y--;
                    } else if (left != null && _location.x - left._location.x == 1) {
                        _location.x--;
                    } else if (above != null && above._location.y - _location.y == 1) {
                        _location.y++;
                    }else{
                        _neighbors = false;
                    }
                    break;
                case 1:
                    _neighbors = true;
                    if (left != null && _location.x - left._location.x == 1) {
                        _location.x--;
                    } else if (above != null && above._location.y - _location.y == 1) {
                        _location.y++;
                    } else if (right != null && right._location.x - _location.x == 1) {
                        _location.x++;
                    } else if (below != null && _location.y - below._location.y == 1) {
                        _location.y--;
                    }else{
                        _neighbors = false;
                    }
                    break;
                case 2:
                    _neighbors = true;
                    if (above != null && above._location.y - _location.y == 1) {
                        _location.y++;
                    } else if (right != null && right._location.x - _location.x == 1) {
                        _location.x++;
                    } else if (below != null &&_location.y - below._location.y == 1) {
                        _location.y--;
                    } else if (left != null && _location.x - left._location.x == 1) {
                        _location.x--;
                    }else{
                        _neighbors = false;
                    }
                    break;
                case 3:
                    _neighbors = true;
                    if (below != null && _location.y - below._location.y == 1) {
                        _location.y--;
                    } else if (left != null && _location.x - left._location.x == 1) {
                        _location.x--;
                    } else if (above != null &&  above._location.y - _location.y == 1) {
                        _location.y++;
                    } else if (right != null &&  right._location.x - _location.x == 1) {
                        _location.x++;
                    }else{
                        _neighbors = false;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    Shape getShape() {
        return Shape.Square;
    }

    @Override
    Color getColor() {
        return new Color(92, 92, 92); }

    @Override
    Boolean isAlive() {
        return _health > 0;
    }

    @Override
    public void move() {
        // Choose a random direction each time move() is called.
        if(_neighbors == false) {
            switch (_rand.nextInt(4)) {
                case 0:
                    _firstMove = true;
                    _direction = 0;
                    _location.x++;
                    break;
                case 1:
                    _firstMove = true;
                    _direction = 1;
                    _location.x--;
                    break;
                case 2:
                    _firstMove = true;
                    _direction = 2;
                    _location.y++;
                    break;
                case 3:
                    _firstMove = true;
                    _direction = 3;
                    _location.y--;
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public Creature spawnNewCreature() {
        return null;
    }
}
