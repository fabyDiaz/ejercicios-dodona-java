import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SimpleTest {

    @Test
    public void testOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        HelloWorld.main(new String[]{});

        String expected = "Hola, soy Maria!\n";
        assertEquals(expected, outContent.toString());
    }
}