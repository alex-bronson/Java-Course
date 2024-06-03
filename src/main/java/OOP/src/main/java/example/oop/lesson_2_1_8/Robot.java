package OOP.src.main.java.example.oop.lesson_2_1_8;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Direction getDirection() {
        // текущее направление взгляда
        return direction;
    }

    public int getX() {
        // текущая координата X
        return x;
    }

    public int getY() {
        // текущая координата Y
        return y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (getDirection()) {
            case UP:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
        }

    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (getDirection()) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        switch (getDirection()) {
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case RIGHT:
                x++;
                break;
            case LEFT:
                x--;
                break;
        }
    }

    public Robot(Direction direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }
}
