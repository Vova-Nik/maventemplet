import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LargestPrimeFactor {

    //https://projecteuler.net/problem=3
/*    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?*/

    public static void main(String[] args) {
        System.out.println(6.00851475143E11d);
        double f = 600851475143d;
        f= 3572000d;
        int a = 10;
        System.out.println(600851475143d);
//        List<Integer> kk = new ArrayList<>();
        int[] cc = new int[300000];

        int c =0;
        cc[0] = 3;
        cc[1] = 5;
        int ind=3;

        for (int i = 2; i < f ; i++) {
            c=i/2-1;
            for (int j = 2; j <=c; j++) {
                if(i%j == 0) break;
                //                if(j==c) kk.add(i);
                if(j==c){
                    cc[ind] = i;
                    ind++;
                }
            }
        }

        System.out.println("Film over. size = " + ind);

    }


    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
//
//    List<Integer> find(int beg, int base){
//        Queue<Integer> q = new PriorityQueue<>();
//        for (int i = 0; i < 64; i++) {
//            q.add(i);
//        }
//
//    }


}
