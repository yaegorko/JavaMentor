package stepik.step4.excep41.excep4110;

import org.junit.Test;

public class GetClassAndMethodTest {

    GetClassAndMethod getClassAndMethod = new GetClassAndMethod();

    @Test
    public void testStackTrace() {
       GetClassAndMethod.anotherMethod();
       GetClassAndMethod.getCallerClassAndMethodName();
    }

}