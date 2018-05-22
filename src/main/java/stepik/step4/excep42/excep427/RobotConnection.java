package stepik.step4.excep42.excep427;

public interface RobotConnection extends AutoCloseable {

    void moveRobotTo(int x, int y);

    @Override
    void close();
}
