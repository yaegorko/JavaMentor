package stepik.step3.oop3312;

import java.util.ArrayList;

public class RobotMove {
    public static void moveRobot(Robot robot, int toX, int toY) {
        class Vector {
            int coordinateA = 0;
            int coordinateB = 0;
            public void setCoordinateA(int coordinateA) {
                this.coordinateA = coordinateA;
            }
            public void setCoordinateB(int coordinateB) {
                this.coordinateB = coordinateB;
            }
        }
        Vector startDirection = new Vector();
        switch (robot.getDirection()) {
            case UP:
                startDirection.setCoordinateA(0);
                startDirection.setCoordinateB(1);
                break;
            case DOWN:
                startDirection.setCoordinateA(0);
                startDirection.setCoordinateB(-1);
            break;
            case LEFT:
                startDirection.setCoordinateA(-1);
                startDirection.setCoordinateB(0);
                break;
            case RIGHT:
                startDirection.setCoordinateA(1);
                startDirection.setCoordinateB(0);
                break;
            default: throw new RuntimeException("unreachable");
        }
        Vector possibleWayVectorX = new Vector();
        possibleWayVectorX.setCoordinateA(toX - robot.getX());
        Vector possibleWayVectorY = new Vector();
        possibleWayVectorY.setCoordinateB(toY - robot.getY());
        int cosX = (int) (((startDirection.coordinateA * possibleWayVectorX.coordinateA) + (startDirection.coordinateB * possibleWayVectorX.coordinateB))
                / ((Math.sqrt(Math.pow(startDirection.coordinateA, 2) + Math.pow(startDirection.coordinateB, 2))
                * (Math.sqrt(Math.pow(possibleWayVectorX.coordinateA, 2) + Math.pow(possibleWayVectorX.coordinateB, 2))))));
        int cosY = (int) (((startDirection.coordinateA * possibleWayVectorY.coordinateA) + (startDirection.coordinateB * possibleWayVectorY.coordinateB))
                / ((Math.sqrt(Math.pow(startDirection.coordinateA, 2) + Math.pow(startDirection.coordinateB, 2))
                * (Math.sqrt(Math.pow(possibleWayVectorY.coordinateA, 2) + Math.pow(possibleWayVectorY.coordinateB, 2))))));
        ArrayList<String> arrayList = new ArrayList<String>();
        if (cosX < 0 && cosY == 0) {
            arrayList.add("TurnLeft");
            arrayList.add("TurnLeft");
            for (int i = 0; i < Math.abs(toX - robot.getX()); i++) {
                arrayList.add("stepForward");
            }
        } else if (cosY < 0 && cosX == 0) {
            arrayList.add("TurnLeft");
            arrayList.add("TurnLeft");
            for (int i = 0; i < Math.abs(toY - robot.getY()); i++) {
                arrayList.add("stepForward");
            }
        } else if (cosX == 0 && cosY == 0) {
            if ((toX - robot.getX() > 0 && toY == robot.getY() && startDirection.coordinateB > 0) || (toX - robot.getX() < 0 && toY == robot.getY() && startDirection.coordinateB < 0)) {
                arrayList.add("TurnRight");
            } else if ((toX - robot.getX() < 0 && toY == robot.getY() && startDirection.coordinateB > 0) || (toX - robot.getX() > 0 && toY == robot.getY() && startDirection.coordinateB < 0)) {
                arrayList.add("TurnLeft");
            }
            for (int i = 0; i < Math.abs(toX - robot.getX()); i++) {
                arrayList.add("stepForward");
            }
            if ((toY - robot.getY() > 0 && toX == robot.getX() && startDirection.coordinateA > 0) || (toY - robot.getY() < 0 && toX == robot.getX() && startDirection.coordinateA < 0)) {
                arrayList.add("TurnLeft");
            } else if ((toY - robot.getY() < 0 && toX == robot.getX() && startDirection.coordinateA > 0) || (toY - robot.getY() > 0 && toX == robot.getX() && startDirection.coordinateA < 0)) {
                arrayList.add("TurnRight");
            }
            for (int i = 0; i < Math.abs(toY - robot.getY()); i++) {
                arrayList.add("stepForward");
            }
        } else if (cosX == 1) {
            for (int i = 0; i < Math.abs(toX - robot.getX()); i++) {
                arrayList.add("stepForward");
            }
            if ((toX - robot.getX() > 0 && toY - robot.getY() > 0) || (toX - robot.getX() < 0 && toY - robot.getY() < 0)) {
                arrayList.add("TurnLeft");

            } else if ((toX - robot.getX() > 0 && toY - robot.getY() < 0) || (toX - robot.getX() < 0 && toY - robot.getY() > 0)) {
                arrayList.add("TurnRight");
            }
            for (int i = 0; i < Math.abs(toY - robot.getY()); i++) {
                arrayList.add("stepForward");
            }
        } else if (cosY == 1) {
            for (int i = 0; i < Math.abs(toY - robot.getY()); i++) {
                arrayList.add("stepForward");
            }
            if ((toY - robot.getY() > 0 && toX - robot.getX() > 0) || (toY - robot.getY() < 0 && toX - robot.getX() < 0)) {
                arrayList.add("TurnRight");
            } else if ((toY - robot.getY() > 0 && toX - robot.getX() < 0) || (toY - robot.getY() < 0 && toX - robot.getX() > 0)) {
                arrayList.add("TurnLeft");
            }
            for (int i = 0; i < Math.abs(toX - robot.getX()); i++) {
                arrayList.add("stepForward");
            }
        } else if (cosX > cosY && ((possibleWayVectorX.coordinateA > 0 && startDirection.coordinateB > 0) || (possibleWayVectorX.coordinateA < 0 && startDirection.coordinateB < 0))) {
            arrayList.add("TurnRight");
            for (int i = 0; i < Math.abs(toX - robot.getX()); i++) {
                arrayList.add("stepForward");
            }
            arrayList.add("TurnRight");
            for (int i = 0; i < Math.abs(toY - robot.getY()); i++) {
                arrayList.add("stepForward");
            }
        } else if ((cosX > cosY && ((possibleWayVectorX.coordinateA > 0 && startDirection.coordinateB < 0) || (possibleWayVectorX.coordinateA < 0 && startDirection.coordinateB > 0)))) {
            arrayList.add("TurnLeft");
            for (int i = 0; i < Math.abs(toX - robot.getX()); i++) {
                arrayList.add("stepForward");
            }
            arrayList.add("TurnLeft");
            for (int i = 0; i < Math.abs(toY - robot.getY()); i++) {
                arrayList.add("stepForward");
            }
        } else if (cosY > cosX && ((possibleWayVectorY.coordinateB > 0 && startDirection.coordinateA < 0) || (possibleWayVectorY.coordinateB < 0 && startDirection.coordinateA > 0))) {
            arrayList.add("TurnRight");
            for (int i = 0; i < Math.abs(toY - robot.getY()); i++) {
                arrayList.add("stepForward");
            }
            arrayList.add("TurnRight");
            for (int i = 0; i < Math.abs(toX - robot.getX()); i++) {
                arrayList.add("stepForward");
            }
        } else if (cosY > cosX && ((possibleWayVectorY.coordinateB < 0 && startDirection.coordinateA < 0) || (possibleWayVectorY.coordinateB > 0 && startDirection.coordinateA > 0))) {
            arrayList.add("TurnLeft");
            for (int i = 0; i < Math.abs(toY - robot.getY()); i++) {
                arrayList.add("stepForward");
            }
            arrayList.add("TurnLeft");
            for (int i = 0; i < Math.abs(toX - robot.getX()); i++) {
                arrayList.add("stepForward");
            }
        }
        for (String action: arrayList) {
            switch (action) {
                case "stepForward":
                    robot.stepForward();
                    break;
                case "TurnLeft":
                    robot.turnLeft();
                    break;
                case "TurnRight":
                    robot.turnRight();
                    break;
                default: throw new RuntimeException("unreachable move");
            }
        }
    }
}
