package stepik.step4.excep42.excep427;

public class MoveRobot {

//    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//
//        boolean isTryCompleted = false;
//        int count = 0;
//        while (!isTryCompleted && count < 3) {
//            try (RobotConnection connection = robotConnectionManager.getConnection()) {
//                connection.moveRobotTo(toX, toY);
//                isTryCompleted = true;
//            } catch (RobotConnectionException e) {
//                count++;
//            }
//        }
//        if (!isTryCompleted) {
//            throw new RobotConnectionException("");
//        }
//    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        RobotConnection connection = null;
        boolean isTryCompleted = false;
        int count = 0;
        while (!isTryCompleted && count < 3) {
            try {
                count++;
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                isTryCompleted = true;
            } catch (RobotConnectionException e) {
                if (count == 3) {
                    throw e;
                }
            } finally {
                try {
                    connection.close();
                } catch (Exception npe) {

                }
            }
        }
    }
}
