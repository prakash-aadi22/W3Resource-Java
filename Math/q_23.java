package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q_23 {
    public static void main(String[] args) {
        List<Double> coefficient = new ArrayList<>();
        coefficient.add(-19.0);
        coefficient.add(7.0);
        coefficient.add(-4.0);
        coefficient.add(6.0);
        System.out.print("The value of -19 + 7x - 4x^2 + 6x^3 when x = 3 is: ");
        System.out.println(polyEval(coefficient, 3));
    }

    public static double polyEval(List<Double> coefficients, double x) {
        Collections.reverse(coefficients);
        Double accumulator = coefficients.get(0);
        for (int i = 1; i < coefficients.size(); i++) {
            accumulator = (accumulator * x) + coefficients.get(i);
        }
        return accumulator;
    }
}
