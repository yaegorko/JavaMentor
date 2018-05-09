package stepik.base21.base2111;

public class APlusB {

    public static boolean doubleExpression(double a, double b, double c) {
       return Math.abs(c - (a + b)) < 0.0001d;
    }
}
