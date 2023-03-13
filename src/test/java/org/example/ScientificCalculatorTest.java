package org.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class ScientificCalculatorTest {
    ScientificCalculator sc = new ScientificCalculator();

    @Test
    public void testSquareRoot() {
        // set the input to the square root function
        String input = "9\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // redirect System.out to a ByteArrayOutputStream
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        // call the square root function
        sc.squareRoot();

        // check the output
        String expectedOutput = "Enter a number: The square root of 9.00 is 3.00\n";
        assertEquals(expectedOutput, output.toString());
    }
    @Test
    public void testFactorial() {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        sc.factorial();
        String expected = "Enter a number: The factorial of 5 is 120\n";
        assertEquals(expected, output.toString());
    }

    @Test
    public void testNaturalLog() {
        String input = "2.71828\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        sc.naturalLog();
        String expected = "Enter a number: The natural logarithm of 2.72 is 1.00\n";
        assertEquals(expected, output.toString());
    }

    @Test
    public void testPower() {
        String input = "2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        sc.power();
        String expected = "Enter the base: Enter the exponent: 2.00 raised to the power of 3.00 is 8.00\n";
        assertEquals(expected, output.toString());
    }

}
