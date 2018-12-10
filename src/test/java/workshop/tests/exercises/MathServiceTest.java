package workshop.tests.exercises;

import org.junit.Test;
import workshop.tests.exercises.Service.MathService;

import static org.junit.Assert.*;

public class MathServiceTest {

    @Test
    public void multiply() {
        //given
        MathService mathService = new MathService();
        int a =10;
        int b =20;

        //then
        assertEquals(200, mathService.multiply(a,b));
    }

}