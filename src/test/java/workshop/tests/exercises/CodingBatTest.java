package workshop.tests.exercises;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {
    static CodingBat codingBat;

    @BeforeClass
            public static void createObject(){
     codingBat = new CodingBat();
    }

    @Test
    public void whenWeekdayAndVacationIsTrue_thenTrue() {
        //given
        //CodingBat codingBat = new CodingBat();
        boolean weekday = true;
        boolean vacation = true;

        //when
        assertEquals(true, codingBat.sleepIn(weekday, vacation));
    }

    @Test
    public void whenWeekdayAndVacationIsFalse_thenTrue() {
        //given
        //CodingBat codingBat = new CodingBat();
        boolean weekday = false;
        boolean vacation = false;

        //when
        assertTrue(codingBat.sleepIn(weekday, vacation));

    }
    @Test
    public void whenWeekdayIsTrueAndVacationIsFalse_thenFalse(){
        //given
       // CodingBat codingBat = new CodingBat();
        boolean weekday = true;
        boolean vacation = false;

        //when
        assertFalse(codingBat.sleepIn(weekday, vacation));
    }

    @Test
    public void whenWeekdayIsFalseAndVacationIsTrue_thenTrue(){
        //given
        //CodingBat codingBat = new CodingBat();
        boolean weekday = false;
        boolean vacation = true;

        //when
        assertTrue(codingBat.sleepIn(weekday, vacation));
    }




}
