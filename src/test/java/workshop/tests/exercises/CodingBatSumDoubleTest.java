package workshop.tests.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatSumDoubleTest {

    @Test
    public void whenTwoNumbersAreEqual_thenReturnDoubleSum() {
        CodingBatSumDouble sum = new CodingBatSumDouble();
        int a = 2;
        int b = 2;
        int expected = (a + b) * 2;

        assertEquals(expected, sum.sumDouble(a, b));

    }
    @Test
    public void whenTwoNumbersAreDifference_thenReturnSum(){
        CodingBatSumDouble sum = new CodingBatSumDouble();
        int a = 5;
        int b = 2;
        int expected = (a + b);

        assertEquals(expected, sum.sumDouble(a,b));
    }
}