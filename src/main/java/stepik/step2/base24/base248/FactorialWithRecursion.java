package stepik.step2.base24.base248;

import java.math.BigInteger;

public class FactorialWithRecursion {
    static BigInteger result;
    public static BigInteger factorial(int value) {

        if (value == 0 || value == 1) {
            result = BigInteger.valueOf(1);
        } else {
            result = BigInteger.valueOf(value--).multiply(factorial(value));
        }
        return result;
    }

}
