package testask.testtask4;

public class MinOfFour {

    public int minOfTwo(int first, int second) {
        return (first < second) ? first : second;
    }

    public int minOfFour(int first, int second, int third, int fours) {
        return minOfTwo(minOfTwo(first, second), minOfTwo(third, fours));
    }
}
