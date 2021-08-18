import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://projecteuler.net/problem=24
//Not finished
public class Lexograf {


    private final static int size = 10;
    private final static int sz = size - 1;
    private final static int arrSize = calculateLength(size);
    private final static int[][] rez = new int[arrSize][size];
    //    private static int[] acc = new int[size + 1];
    private static int[] acc = {4,3,2,1,0,0,0,0,0,0};

    private static int changer;

    public static int[][] getRez() {
        return rez;
    }

    public static List<String> getRezList(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {

            sb.append("\n");
            for (int j=9; j>=0; j--) {
                sb.append(rez[i][j]).append(' ');
            }
            sb.setLength(sb.length()-1);
            list.add(sb.toString());

            sb.setLength(0);

        }
        return list;
    }

    public static void builder(int end) {
        int counter = 0;
        int counter1=0, counter2=0,counter3=0,counter4=0,counter5=0,counter6=0,counter7=0, counter8=0, counter9=0, counter10=0;
        do {
            rez[counter] = acc.clone();
            counter++;
            counter1++;
            counter2++;
            counter3++;
            counter4++;
            counter5++;
            counter6++;
            counter6++;
            counter7++;
            counter8++;
            counter9++;
            counter10++;

            turn1();
            if (counter2  == 2){
                counter2=0;
                turn2();
            }
            if (counter3 == 6){
                counter3=0;
                turn3();
            }
            if (counter4 ==24){
                counter4 =0;
                turn4();
            }

        } while (counter < end);
    }

    static void turn1() {
        changer = acc[0];
        acc[0] = acc[1];
        acc[1] = changer;
    }

    static void turn2() {
        changer = acc[1];
        acc[1] = acc[2];
        acc[2] = changer;
    }

    static void turn3() {
        changer = acc[2];
        acc[2] = acc[3];
        acc[3] = changer;
    }

    static void turn4() {
        changer = acc[2];
        acc[2] = acc[3];
        acc[3] = changer;
    }

    public static boolean check() {
        for (int i = sz; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (acc[j] == acc[i]) return false;
            }
        }
        return true;
    }

    public static void inc() {
        for (int i = size; i >= 0; i--) {
            acc[i]++;
            if (acc[i] < 10) {
                return;
            } else {
                acc[i] = 0;
            }
        }
    }

    public static void build(int sz) {
        if (size > 10000000) throw new IllegalArgumentException("Too large request. 10000000 max");
        int index = 0;
        acc = Arrays.stream(acc).map(v -> v = 0).toArray();
        do {
            inc();
            if (check()) {
                rez[index] = acc.clone();
                index++;
            }
        } while (index < sz);
    }

    public static char[] toArm(double arg) {
        char[] a = new char[10];
        a[0] = (char) (arg / 1000000000 + 0x30);
        arg = arg % 1000000000;
        a[1] = (char) (arg / 100000000 + 0x30);
        arg = arg % 100000000;
        a[2] = (char) (arg / 10000000 + 0x30);
        arg = arg % 10000000;
        a[3] = (char) (arg / 1000000 + 0x30);
        arg = arg % 1000000;
        a[4] = (char) (arg / 100000 + 0x30);
        arg = arg % 100000;
        a[5] = (char) (arg / 10000 + 0x30);
        arg = arg % 10000;
        a[6] = (char) (arg / 1000 + 0x30);
        arg = arg % 1000;
        a[7] = (char) (arg / 100 + 0x30);
        arg = arg % 100;
        a[8] = (char) (arg / 10 + 0x30);
        arg = arg % 10;
        a[9] = (char) (arg + 0x30);
        return a;
    }


    public static char[] toArr(double arg) {
        String s = Double.toString(arg);
        return (s.substring(0, s.length() - 2)).toCharArray();
    }

    static int calculateLength(int size) {
        int rez = 0;
        switch (size) {
            case 3:
                rez = 6;
                break;
            case 4:
                rez = 24;
                break;
            case 5:
                rez = 120;
                break;
            case 6:
                rez = 720;
                break;
            case 7:
                rez = 5040;
                break;
            case 8:
                rez = 40320;
                break;
            case 9:
                rez = 362880;
                break;
            case 10:
                rez = 3628800;
                break;
            default:
                throw new IllegalArgumentException("Bad length");
        }
        return rez;
    }


    public static boolean checkTest(String s) {
        acc = s.chars().toArray();
        for (int i = sz; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (acc[j] == acc[i]) return false;
            }
        }
        return true;
    }

}
