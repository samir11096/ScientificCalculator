package org.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class ScientificCalculatorTest {
    ScientificCalculator sc = new ScientificCalculator();


    private static final double DELTA = 1e-15;

//    @Test
//    public void squareRootTruePositive(){
//        assertEquals("Square Root of number for True Positive", 3.0, sc.squareRoot(9), DELTA);
//        assertEquals("Square Root of number for True Positive", 4.0, sc.squareRoot(16), DELTA);
//        assertEquals("Square Root of number for True Positive", Double.NaN, sc.squareRoot(-10), DELTA);
//    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Square Root of number for False Positive", 4.0, sc.squareRoot(10), DELTA);
        assertNotEquals("Square Root of number for False Positive", 5.0, sc.squareRoot(16), DELTA);
        assertNotEquals("Square Root of number for False Positive", 5.0, sc.squareRoot(-16), DELTA);
    }

    @Test
    public void factorialTruePositive(){

        assertEquals("Factorial of number for True positive", 6.0,sc.factorial(3), DELTA);
        assertEquals("Factorial of number for True positive", 120.0,sc.factorial(5), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Factorial of number for False positive", 8.0,sc.factorial(3), DELTA);
        assertNotEquals("Factorial of number for False positive", 60.0,sc.factorial(5), DELTA);
    }

    @Test
    public void naturalLogTruePositive(){
        assertEquals("Naturallog of number for True positive", 2.833213344056216,sc.naturalLog(17), DELTA);
        assertEquals("Naturallog of number for True positive", 1.791759469228055,sc.naturalLog(6), DELTA);
    }

    @Test
    public void naturalLogFalsePositive(){
        assertNotEquals("Naturallog of number for False positive", 2.833213344056216,sc.naturalLog(14), DELTA);
        assertNotEquals("Naturallog of number for False positive", 1.791759469228055,sc.naturalLog(9), DELTA);
        assertNotEquals("Naturallog of number for False positive", 0, sc.naturalLog(0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Power of number for True positive", 4.0,sc.power(2, 2), DELTA);
        assertEquals("Power of number for True positive", 27.0,sc.power(3,3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Power of number for False positive", 4.0,sc.power(2, 3), DELTA);
        assertNotEquals("Power of number for False positive", 5.0,sc.power(3,3), DELTA);
    }
}
