package Manhattan;

import java.util.Arrays;

public class Tablo {
    static String matrix;
    static String tmpl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

    int L;
    int H;
    int matrixOfset;

    char[] in;
    char[] out;
    int outLen;
    int outOfset;

    public Tablo(int L, int H, String inpMatrix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inpMatrix.length(); i++) {
            if (i % (L * 27 - 1) == 0 && i != 0) sb.append(' ');
            sb.append(inpMatrix.charAt(i));
        }
        sb.append(' ');
        matrix = sb.toString();
        System.out.println("matrix length = " + matrix.length());
        this.L = L;
        this.H = H;
        matrixOfset = L * 27;
    }


    public String recode(String toRecode) {
        in = toRecode.toCharArray();
        out = new char[H * L * in.length];
        outLen = toRecode.length() * L * H;
        out = new char[outLen];
        outOfset = outLen / H;

        for (int i = 0; i < toRecode.length(); i++) {
            if (tmpl.indexOf(in[i]) < 0) {
                in[i] = '?';
            }
        }
        toRecode = new String(in);
        for (int l = 0; l < in.length; l++) {
            int matrixAdress = tmpl.indexOf(toRecode.charAt(l)) * L;
            int outAdress = l * L;
            int x = 0, ym = 0, yo=0;
            for (int i = 0; i < H * L; i++) {
                if (i % L == 0 && i!=0) {
                    ym += matrixOfset;
                    yo += outOfset;
                    x=0;
                }
                out[outAdress + x + yo] = matrix.charAt(matrixAdress + x + ym);
                x++;
            }

        }
        return new String(out);
    }

    public String getMatrix() {
        return matrix;
    }

    public String getOut() {
        return new String(out);
    }
}
