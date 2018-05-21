package stepik.step4.excep41.excep4110;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GetClassAndMethodTest {

    @Test
    public void testStackTrace() {
       GetClassAndMethod.anotherMethod();
       GetClassAndMethod.getCallerClassAndMethodName();
    }

}