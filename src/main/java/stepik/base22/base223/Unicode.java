package stepik.base22.base223;

public class Unicode {
    public static char charExpression(int a) {
        int code = '\\';
        code += a;
        return (char) code;
    }
}
