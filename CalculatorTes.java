import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTes{

    static Calculato calculator;

    @BeforeClass
    public static void setUpBeforeClass() {
        calculator = new Calculato();
        System.out.println("Before all test cases");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("After all test cases");
    }

    @Before
    public void setUp() {
        System.out.println("Before each test");
    }

    @Test
    public void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }
}
