package workshop.tests.exercises;

import workshop.tests.exercises.Service.MathService;

public class MathApp {
    private MathService math;

    public void setMath(MathService math) {
        this.math = math;
    }

    public int AddToMultiply(int c){

        return math.multiply(2,4) + c;
    }
}
