package stepik.step4.excep42.excep427;

public class MoveRobot {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        boolean isTryCompleted = false;
        int i = 0;
        while (true) {
            try(RobotConnection connection = robotConnectionManager.getConnection()) {
               connection.moveRobotTo(toX, toY);
               isTryCompleted = true;
            } catch (RobotConnectionException e) {
                if (isTryCompleted) {
                    return;
                } else if (i < 3) {
                    i++;
                } else if (i == 3) {
                    throw new RobotConnectionException("");
                }
            } catch (Exception t) {
                throw new RobotConnectionException("", t);
            }
        }
    }
}


