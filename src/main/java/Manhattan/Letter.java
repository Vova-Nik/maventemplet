package Manhattan;
/*
          #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###
         # # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #
         ### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##
         # # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #
         # # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #
*/

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Letter{
    int l;
    int h;

    char letter;
    String tmpl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
    char[][] arr;

    public Letter(int l, int h, String s, char letter){
        this.l=l;
        this.h=h;

        int sLen = s.indexOf("\n")+1;
//        this.s = s.replace("\n", " ");

//        this.letter = letter;
//        int letterNum = tmpl.indexOf(letter);
//        arr = new char[l][h];
//        int letterAdr = letterNum * l;
//        for (int i = 0; i <h; i++) {
//            for (int j = 0; j < l; j++) {
//                arr[i][j] = s.charAt(i * sLen + j + letterAdr);
//            }
//        }
    }
    public char[][] getLetter(){
        String tt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
        Set<Character> chs = tt.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());
//        IntStream chs = tt.chars();
//        Set<Character> chset = chs.collect(Collectors.toSet())
        return arr.clone();
    }

}
