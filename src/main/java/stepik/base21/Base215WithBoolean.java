package stepik.base21;

public class Base215WithBoolean {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean result = false;

        if ((a == true && b == true) && (c == true && d == true)) {
            result = true;
        }

        return result;
    }
}
