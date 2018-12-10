package workshop.tests.exercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import workshop.tests.exercises.Service.MathService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathAppTest {

    @Mock
    MathService mathService;

    @InjectMocks
    MathApp mathApp = new MathApp();


    @Test
    public void multiply() {
        when(mathService.multiply(2, 4)).thenReturn(15);
        assertEquals(20, mathApp.AddToMultiply(5));
    }

    @Test
    public void multiply2() {
        //given
        MathService mathService = new MathService();
        MathApp mathApp = new MathApp();
        mathApp.setMath(mathService);

        //when
        int a = mathService.multiply(2, 4);

        //then
        assertEquals(13, mathApp.AddToMultiply(5));

    }
}