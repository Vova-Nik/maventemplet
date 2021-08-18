//https://projecteuler.net/problem=20

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Factorial {

    public double getFactorial(int inp) {
        if (inp > 128 || inp < 0) throw new IllegalArgumentException("Input should be in 0...128");
        if (inp == 0) return 1;
        return calculate(inp, 1);
    }

    private double calculate(int in, double out) {
        out = in * out;
        in--;
        if (in == 0) return out;
        return calculate(in, out);
    }

    int sumOfDigits(double fact){
        NumberFormat nf = DecimalFormat.getInstance();
        nf.setMaximumFractionDigits(0);
        String str = nf.format(fact);
        int sum = str.chars()
                .filter(c -> c > 0x30 && c < 0x40)
                .map(c -> (Integer) Character.getNumericValue(c))
                .reduce(0, (a, b) -> a + b);
        return sum;
    }
}
