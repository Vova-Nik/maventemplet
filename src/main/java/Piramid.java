import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://projecteuler.net/problem=18
public class Piramid {
    int size = 0;
    int[][] pira;

    public Piramid() {
        int[][] pp = {
                {3},
                {7, 4},
                {2, 4, 6},
                {8, 5, 9, 3}
        };
        this.size = 3;
        this.pira = pp;
    }

    public Piramid(String var) {
        int[][] pp = {
                {3},
                {7, 4},
                {2, 4, 6},
                {8, 5, 9, 3},
                {2, 2, 2, 2, 2}
        };
        this.size = 4;
        this.pira = pp;
    }

    public Piramid(int size) {
        this.size = size;
    }

    List<Integer> pass = new ArrayList<>();

    private void findPass() {
        pass.add(0);
        for (int i = 0; i <size; i++) {
            pass.add(findNext(i,pass.get(i)));
        }
    }

    public int calculatePass(){
        findPass();
        int rez=0;
        for (int i = 0; i <= size; i++) {
            rez+=pira[i][pass.get(i)];
        }
        return rez;
    }

    private Integer findNext(int row, int col){
        int nextL = pira[row+1][col];
        int nextR = pira[row+1][col+1];
        return  nextL >= nextR ? col : col+1;
    }

}


