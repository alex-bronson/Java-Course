package OOP.src.main.java.example.oop.lesson_2_1_8;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0,0);

        moveRobot(robot, -4, 6);

    }

    public static void  moveRobot(Robot robot, int x, int y) {
        //Перемещение робота
        int robotX = robot.getX();
        int robotY = robot.getY();

        if (robotX >= x) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robotX != x) {
                robot.stepForward();
                System.out.println("Координаты робота: " + robot.getX() + " " + robot.getY());
                robotX--;
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robotX != x) {
                robot.stepForward();
                System.out.println("Координаты робота: " + robot.getX() + " " + robot.getY());
                robotX++;
            }
        }

        if (robotY >= y) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (robotY != y) {
                robot.stepForward();
                System.out.println("Координаты робота: " + robot.getX() + " " + robot.getY());
                robotY--;
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (robotY != y) {
                robot.stepForward();
                System.out.println("Координаты робота: " + robot.getX() + " " + robot.getY());
                robotY++;
            }
        }
        System.out.println("Робот на месте!");
    }
}
