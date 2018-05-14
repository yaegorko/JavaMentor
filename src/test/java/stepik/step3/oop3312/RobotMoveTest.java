package stepik.step3.oop3312;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotMoveTest {

    Robot robotRF = new Robot(1, 1, Direction.RIGHT);
    Robot robotLF = new Robot(1, 1, Direction.LEFT);
    Robot robotUF = new Robot(1, 1, Direction.UP);
    Robot robotDF = new Robot(1, 1, Direction.DOWN);

    //вправо вверх
    @Test //5
    public void whenFaceToRightAndMoveToRightAndUp() {
       RobotMove.moveRobot(robotRF, 3, 3);
    }
    @Test //6
    public void whenFaceToLeftAndMoveToUPAndRight() {
        RobotMove.moveRobot(robotLF, 3, 3);
    }
    @Test //5
    public void whenFaceToUpAndMoveUPAndRight() {
        RobotMove.moveRobot(robotUF, 3, 3);
    }
    @Test //6
    public void whenFaceToDownAndMoveRightAndUp() {
        RobotMove.moveRobot(robotDF, 3, 3);
    }

    //вправо вниз
    @Test //5
    public void whenFaceToRightAndMoveToRightAndDown() {
        RobotMove.moveRobot(robotRF, 3, -1);
    }
    @Test //6
    public void whenFaceToLeftAndMoveToDownAndRight() {
        RobotMove.moveRobot(robotLF, 3, -1);
    }
    @Test //6
    public void whenFaceToUpAndMoveRightAndDown() {
        RobotMove.moveRobot(robotUF, 3, -1);
    }
    @Test //5
    public void whenFaceToDownAndMoveDownAndRight() {
        RobotMove.moveRobot(robotDF, 3, -1);
    }

    //влево вверх
    @Test //6
    public void whenFaceToRightAndMoveToUpAndLeft() {
        RobotMove.moveRobot(robotRF, -1, 3);
    }
    @Test //5
    public void whenFaceToLeftAndMoveToLeftAndUp() {
        RobotMove.moveRobot(robotLF, -1, 3);
    }
    @Test //5
    public void whenFaceToUpAndMoveToUpAndLeft() {
        RobotMove.moveRobot(robotUF, -1, 3);
    }
    @Test //6
    public void whenFaceToDownAndMoveLeftAndUp() {
        RobotMove.moveRobot(robotDF, -1, 3);
    }

    //влево вниз
    @Test //6
    public void whenFaceToRightAndMoveToDownAndLeft() {
        RobotMove.moveRobot(robotRF, -1, -1);
    }
    @Test //5
    public void whenFaceToLeftAndMoveToLeftAndDown() {
        RobotMove.moveRobot(robotLF, -1, -1);
    }
    @Test //6
    public void whenFaceToUpAndMoveLeftAndDown() {
        RobotMove.moveRobot(robotUF, -1, -1);
    }
    //do not move
    @Test
    public void whenDonNotMove() {
        RobotMove.moveRobot(robotLF, 1, 1);
    }

    //straight ahead

    @Test //2
    public void whenFaceRightAndMoveToRight() {
        RobotMove.moveRobot(robotRF, 3, 1);
    }

    @Test //4
    public void whenFaceLeftAndMoveToRight() {
        RobotMove.moveRobot(robotLF, 3, 1);
    }

    @Test
    public void whenFaceUpAndMoveToRight() {
        RobotMove.moveRobot(robotUF, 3, 1);
    }

    @Test
    public void whenFaceDownAndMoveToRight() {
        RobotMove.moveRobot(robotDF, 3, 1);
    }

    @Test
    public void whenFaceUpAndMoveToLeft() {
        RobotMove.moveRobot(robotUF, -1, 1);
    }

    @Test
    public void whenFaceDownAndMoveToLeft() {
        RobotMove.moveRobot(robotDF, -1, 1);
    }

    @Test
    public void whenFaceLeftAndMoveToUp() {
        RobotMove.moveRobot(robotLF, 1, 3);
    }


}