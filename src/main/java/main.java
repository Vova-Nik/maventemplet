import java.io.InputStream;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Fibonachi fibo = new Fibonachi();
        System.out.println("Give size of required Fibonachi sequence");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println(fibo.fibonachiString(size));
    }
}


