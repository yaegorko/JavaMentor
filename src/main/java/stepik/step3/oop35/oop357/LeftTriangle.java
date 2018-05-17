package stepik.step3.oop35.oop357;


import java.util.function.DoubleUnaryOperator;

public class LeftTriangle {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        double row = 0;

        while (a < b) {
            row += f.applyAsDouble(a);
            a += Math.pow(10, -6);
        }

        return row * Math.pow(10, -6);
    }
}
