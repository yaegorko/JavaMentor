package stepik.step3.oop3312;

public class Robot {

    int x;
    int y;
    Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            default:
            case DOWN: direction = Direction.LEFT;
                break;
            case UP: direction = Direction.LEFT;
                break;
            case RIGHT: direction = Direction.UP;
                break;
            case LEFT: direction = Direction.DOWN;
        }
    }
    public void turnRight() {
        switch (getDirection()) {
            default:
            case DOWN: direction = Direction.RIGHT;
                break;
            case UP: direction = Direction.LEFT;
                break;
            case RIGHT: direction = Direction.DOWN;
                break;
            case LEFT: direction = Direction.UP;
        }
    }
    public void stepForward() {
        switch (getDirection()) {
            default:
            case RIGHT: x++;
                break;
            case LEFT: x--;
                break;
            case UP: y++;
                break;
            case DOWN: y--;
                break;
        }
    }
}

