import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fibonachi {
    double[] tmpl = {0, 1, 1};

    private static DecimalFormat df = new DecimalFormat("#");

    public double[] calculate(int size) {
        if (size <= 0) {
            return new double[0];
        }
        double[] fibo = Arrays.copyOf(tmpl, size);
        if (size <= 3) {
            return Arrays.copyOf(fibo, size);
        }
        for (int i = 3; i < size; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]);
        }
        return fibo;
    }

    String fibonachiString(int size) {
        double[] arr = calculate(size);
        String[] str = Arrays.stream(arr)
                .mapToObj(a->df.format(a) + ", ")
                .toArray(String[]::new);

        String rezult = Arrays.stream(arr)
                .mapToObj(a -> df.format(a) + "\n")
                .reduce("", (substring, element) -> substring + element);
        return rezult;
    }
}

//https://projecteuler.net/problem=18