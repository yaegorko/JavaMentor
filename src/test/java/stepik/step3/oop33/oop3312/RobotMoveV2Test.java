package stepik.step3.oop33.oop3312;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RobotMoveV2Test {

    RobotMoveV2 robotMoveV2 = new RobotMoveV2();

    Robot robotRF = new Robot(1, 1, Direction.RIGHT);
    Robot robotLF = new Robot(1, 1, Direction.LEFT);
    Robot robotUF = new Robot(1, 1, Direction.UP);
    Robot robotDF = new Robot(1, 1, Direction.DOWN);

    @Test //5
    public void whenFaceToRightAndMoveToRightAndUp() {
       // Robot robotRF = new Robot(1, 1, Direction.RIGHT);
        RobotMoveV2.moveRobot(robotRF, 3, 3);
        assertThat(robotRF.getX(), is(3));
        assertThat(robotRF.getY(), is(3));
    }

    @Test //6
    public void whenFaceToLeftAndMoveToUPAndRight() {
       // Robot robotLF = new Robot(1, 1, Direction.LEFT);
        RobotMoveV2.moveRobot(robotLF, 3, 3);
        assertThat(robotLF.getX(), is(3));
        assertThat(robotLF.getY(), is(3));
    }

    @Test //2
    public void whenFaceRightAndMoveToRight() {
       // Robot robotRF = new Robot(1, 1, Direction.RIGHT);
        RobotMoveV2.moveRobot(robotRF, 3, 1);
        assertThat(robotRF.getX(), is(3));
        assertThat(robotRF.getY(), is(1));
    }

    @Test
    public void whenFaceLeftAndMoveToRight() {
        RobotMoveV2.moveRobot(robotLF, 3, 1);
        assertThat(robotLF.getX(), is(3));
        assertThat(robotLF.getY(), is(1));
    }

    @Test
    public void whenNoWay() {
        RobotMoveV2.moveRobot(robotLF, 1, 1);
        assertThat(robotLF.getX(), is(1));
        assertThat(robotLF.getY(), is(1));
    }



}