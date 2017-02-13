package pitexample;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testMe() {
        //Yes, this should be multiple test cases...
        MyClass sut = new MyClass();
        assertTrue(sut.myMethod(1, true));

    }

    @Test
    public void testMe2() {
        MyClass sut = new MyClass();
        assertTrue(sut.myMethod(2, true));
    }

    @Test
    public void testMe3() {
        MyClass sut = new MyClass();
        assertTrue(sut.myMethod(1, false));
    }

    @Test
    public void testMe4() {
        MyClass sut = new MyClass();
        assertTrue(sut.myMethod(2, false));
    }

    @Test
    public void testMe5() {
        MyClass sut = new MyClass();
        assertFalse(sut.myMethod(0, false));
    }
}
