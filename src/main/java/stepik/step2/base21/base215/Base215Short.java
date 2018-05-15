package stepik.step2.base21.base215;

public class Base215Short {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ^ b) & (b ^ d) || (a ^ c) & (b ^ d);
    }
}
