package stepik.base21;

public class Base215 {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {

        boolean result = false;
        boolean[] arguments = {a, b, c, d};
        int countOfTrue = 0;

        for (int i = 0; i < arguments.length; i++) {
            if (arguments[i] == true) {
                countOfTrue++;
            }
        }
        if (countOfTrue == 2) {
            result = true;
        }
        return result;
    }
}
