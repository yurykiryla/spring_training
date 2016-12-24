/**
 * 
 */
package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author yuryk
 *
 */
public class GreeterTest {
    
    private Greeter greeter = new Greeter();

    /**
     * Test method for {@link hello.Greeter#sayHello()}.
     */
    @Test
    public void testSayHello() {
	assertThat(greeter.sayHello(), containsString("Hello"));
    }

}
