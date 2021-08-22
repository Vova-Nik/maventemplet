class NumFormatConverter {
    public static void main(String[] args) {
        String s = "16";
        int b = 10;
        int n = 8;
        int ii = toInt(s, b, n);
        System.out.println(ii);
        String res = toNum(ii, n);
        System.out.println(res);
    }

    static int toInt(String s, int b, int n) {
        char[] ss = s.toCharArray();
        int si = 0;
        for (int i = 0; i < ss.length; i++) {
            si += Character.getNumericValue(ss[i]) * Math.pow(b, ss.length - i - 1);
        }
        return si;
    }

    static String toNum(int tp, int b) {
        StringBuilder result = new StringBuilder();
        int r1 = 0;
        int r2 = 0;
        for (int i = 8; i >= 0; i--) {
            int pow = (int) Math.pow(b, i);
            r1 = tp / pow;
            r2 = tp % pow;
            result.append(r1);
            tp = r2;
        }
        String s = result.toString();
        s = s.replaceFirst ("^0*", "");
        return s;
    }
}
