package stepik.base21;

public class Base215WithBoolean {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
       return (a || c || d) && (a || b || c) && (b || c || d) && (a || b || d)
               && (!b || !c || !d) && (!a || !c || !d) && (!a || !b || !d) && (!a || !b || !c);
    }
}
