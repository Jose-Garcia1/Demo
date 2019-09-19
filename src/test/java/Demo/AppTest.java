package Demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("\n" + 
        		"la aplicación debería tener un saludo", classUnderTest.getGreeting());
    }
}