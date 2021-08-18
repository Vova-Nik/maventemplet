package Manhattan;

import java.util.Arrays;

public class Tablo {
    static String matrix;
    static String tmpl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?"; //l=27

    int L=4;
    int H=5;
    int matrixOfset;

    char[] in;
    char[] out;
    int outLen;
    int outOfset;

    public Tablo(int L, int H, String tmpl) {
            StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tmpl.length(); i++) {

            if(i%(L*27-1)==0 && i!=0) sb.append(' ');
            sb.append(tmpl.charAt(i));
        }
        matrix=sb.toString();
         this.L=L;
         this.H=H;
        matrixOfset = L*27;

    }


    public String recode(String toRecode) {
        in = toRecode.toCharArray();

        out =new char[H*L*in.length];
        in = toRecode.toCharArray();
        outLen = toRecode.length() * L * H;
        out = new char[outLen];
        outOfset = outLen/H;

        for (int i = 0; i < toRecode.length(); i++) {
            if (tmpl.indexOf(in[i])<0){
                in[i] = '?';
            }
        }

        //matrixOfset = 108;
        //outOfset outLen/H;
        for (int l = 0; l < in.length; l++) {
            int matrixIndex = matrix.indexOf(toRecode.charAt(l));
            int matrixAdress = matrixIndex*L;
            int outAdress = l*L;

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < L; j++) {
                    int iii = matrixAdress + i * matrixOfset + j;
                    char r = matrix.charAt(iii);

                    int outInd = j + i * outOfset;
                    out[outInd] = r;
                }
            }
        }
        return new String(out);
    }

    public String getMatrix(){
        return matrix;
    }
    public String getOut(){
        return new String(out);
    }

//public char getNextSymbol()

}
