package ErrorAndException.lesson_3_2_6;

public class Main {
    public static void main(String[] args) {
        RobotConnectionManager manager = new CheckConnection();
        RobotController controller = new RobotController();

        try {
            controller.moveRobot(manager, 10, 20);
        } catch (RobotConnectionException e) {
            System.err.println("Failed to move the robot: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

