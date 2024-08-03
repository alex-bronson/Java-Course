package ErrorAndException.lesson_3_2_6;

public class RobotConnectionImpl implements RobotConnection {
    @Override
    public void moveRobotTo(int x, int y) {
        System.out.println("Robot is moving to point (" + x + ", " + y + ")");
    }

    @Override
    public void close() {
        System.out.println("Connection closed");
    }
}
