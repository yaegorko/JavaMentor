package stepik.step3.oop33.oop3312;

public class RobotMoveV2 {

    public static void moveRobot(Robot robot, int toX, int toY) {

        int countStepX = Math.abs(toX - robot.getX());
        int countStepY = Math.abs(toY - robot.getY());

        switch (robot.getDirection()) {
            default:
            case UP:
                if (toX - robot.getX() > 0) {
                    robot.turnRight();
                } else if (toX - robot.getX() < 0) {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (toX - robot.getX() > 0) {
                    robot.turnLeft();
                } else if (toX - robot.getX() < 0) {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (toX - robot.getX() > 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if (toX - robot.getX() < 0) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
        }

        for (int i = 0; i < countStepX; i++) {
            robot.stepForward();
        }

        switch (robot.getDirection()) {
            default:
            case LEFT:
                if (toY - robot.getY() > 0) {
                    robot.turnRight();
                } else if (toY - robot.getY() < 0) {
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if (toY - robot.getY() > 0) {
                    robot.turnLeft();
                } else if (toY - robot.getY() < 0) {
                    robot.turnRight();
                }
                break;
            case UP:
                if (toY - robot.getY() < 0) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            case DOWN:
                if (toY - robot.getY() > 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
        }

        for (int i = 0; i < countStepY; i++) {
            robot.stepForward();
        }
    }
}
