package stepik.step4.excep41.excep419;

public class SQRT {
    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        } else {
            return Math.sqrt(x);
        }
    }
}
