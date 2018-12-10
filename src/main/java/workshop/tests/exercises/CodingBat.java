package workshop.tests.exercises;

public class CodingBat {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
}
