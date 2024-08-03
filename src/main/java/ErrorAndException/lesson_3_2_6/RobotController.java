package ErrorAndException.lesson_3_2_6;

public class RobotController {
    public void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int attempts = 3;

        for (int i = 0; i < attempts; i++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException e) {
                if (i == attempts - 1) {
                    throw e;
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }
}

