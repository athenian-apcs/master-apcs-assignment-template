import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testGreeting() {
        MyClass chinese = new MyClass("Ni Hao!");
        MyClass spanish = new MyClass("Hola!");

        // assert statements
        assertEquals("Ni Hao!", chinese.getGreeting());
        assertEquals("Hola!", spanish.getGreeting());
    }
}
