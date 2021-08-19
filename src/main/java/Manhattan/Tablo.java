package Manhattan;

import java.util.Arrays;

public class Tablo {
    String matrix;
    String tmpl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
    int L, H;
    int matrixOfset;
    char[] in;
    char[] out;
    int outLen;
    int outOfset;

    Tablo(int L, int H, String inpMatrix) {
        this.L = L;
        this.H = H;
        this.matrix = inpMatrix;
        matrixOfset = L * 27;
        // System.err.println(inpMatrix);
    }


    public String[] recode(String toRecode) {
        toRecode = toRecode.toUpperCase();
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
        int matrixAdress, outAdress;
        int x = 0, ym = 0, yo = 0;

        for (int l = 0; l < in.length; l++) {
            matrixAdress = tmpl.indexOf(toRecode.charAt(l)) * L;
            outAdress = l * L;

            for (int i = 0; i < L*H; i++) {
                for (int j = 0; j < L; j++) {
                    char r = matrix.charAt(matrixAdress + j);
                    out[outAdress + j ] = r;
                }
                matrixAdress+=matrixOfset;
                outAdress+=outOfset;


            }

        }

        String[] outar = new String[H];
        StringBuilder sb = new StringBuilder();
        int line = 0;

        for (int l = 0; l < out.length; l++) {
            if (l != 0 && l % outOfset == 0) {
                outar[line] = sb.toString();
                sb.setLength(0);
                line++;
            }
            sb.append(out[l]);
        }
        outar[line] = sb.toString();

        return outar;
    }

    public String getMatrix() {
        return matrix;
    }

    public String getOut() {
        return new String(out);
    }
}
