import java.util.ArrayList;

public class ChuckNorris {

    static String stringToBin(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length(); i++) {
            StringBuilder oneChar  = new StringBuilder(Integer.toString((int) s.charAt(i), 2));
            while(oneChar.length()<7){
                oneChar.insert(0, '0');
            }
              sb.append(oneChar);
        }
        return sb.toString();
    }

    static String convert(String str) {
        StringBuilder sb = new StringBuilder();
        int pointer = 0;
        boolean eof = false;
        char current = str.charAt(pointer);

        while (!eof) {
            current = str.charAt(pointer);
            if (str.charAt(pointer) == '1') {
                sb.append("0 ");
            } else {
                sb.append("00 ");
            }

            do {
                sb.append('0');
                pointer++;
                if (pointer == str.length()) {
                    eof = true;
                    break;
                }
                if (str.charAt(pointer) != current) {
//                    sb.append('\n');
                    sb.append(' ');
                    break;
                }
            } while (str.charAt(pointer) == current);
        }
        return sb.toString();
    }

}
