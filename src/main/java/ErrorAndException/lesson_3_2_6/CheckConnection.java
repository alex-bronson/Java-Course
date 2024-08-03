package ErrorAndException.lesson_3_2_6;

public class CheckConnection implements RobotConnectionManager {
    public RobotConnection getConnection() {
        System.out.println("Connection complete");
        return new RobotConnectionImpl();
    }
}



