package hello;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreeterTest{
    @Test
    public void testApp(){
	Greeter greeter = new Greeter();
  	String ouput = greeter.sayHello();
	String expectedOutput  = "Hello World!";
        assertEquals(expectedOutput,ouput);
    }
}
