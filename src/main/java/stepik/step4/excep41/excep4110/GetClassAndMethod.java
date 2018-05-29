package stepik.step4.excep41.excep4110;

public class GetClassAndMethod {

    public static void main(String[] args) {

        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }



    public static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

//    //Можно неявно вызывать СтекТрейс и запихнуть почти все в одну строку
//    public static String getCallerClassAndMethodName() {
//        String result;
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        if (stackTraceElements.length > 3) {
//            StackTraceElement element = stackTraceElements[3];
//            String className = element.getClassName();
//            String methodName = element.getMethodName();
//            result = className + "#" + methodName;
//        } else {
//            return null;
//        }
//        return result;
//    }
    public static String getCallerClassAndMethodName() {
        String result = null;
        Exception exception = new Exception();
        StackTraceElement[] stackTraceElements = exception.getStackTrace();
        if (stackTraceElements.length > 2) {
            StackTraceElement element = stackTraceElements[2];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            result = className + "#" + methodName;

        }
        return result;
    }
}
