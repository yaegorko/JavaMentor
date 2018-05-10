package stepik.base22.base229;

public class DegreeOfTwo {
    public static boolean isPowerOfTwo(int value) {
        return  Integer.bitCount(Math.abs(value)) == 1;
    }
}
