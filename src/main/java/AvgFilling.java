public class AvgFilling {

    public String doFill(String inp) {
        String[] inps = inp.split(" ");
        int[] dig = new int[2];
        int digind = 0;
        int dist = 1;
        for (String s : inps) {
            if (!s.equals("_") && digind == 0) {
                dig[digind] = Integer.parseInt(s);
                digind++;
                if (digind > 1)
                    throw new IllegalArgumentException("Bad input data/ There should be only 2 digitc in string");
                continue;
            }
            if (!s.equals("_") && digind == 1) {
                dig[digind] = Integer.parseInt(s);
                break;
            }
            if (s.equals("_") && digind == 1) {
                dist++;
            }
        }
        int step = (dig[1] - dig[0]) / dist;
        int[] spaces = new int[3];
        int spacesInd = 0;
        for (String s : inps) {
            if (spacesInd == 0 && s.equals("_")) {
                spaces[0]++;
                continue;
            }
            if (spacesInd == 0 && !s.equals("_")) {
                spacesInd++;
                continue;
            }
            if (spacesInd == 1 && s.equals("_")) {
                spaces[1]++;
                continue;
            }
            if (spacesInd == 1 && !s.equals("_")) {
                spacesInd++;
                continue;
            }
            if (spacesInd == 2 && s.equals("_")) {
                spaces[2]++;
            }

        }
        int first = dig[0] - spaces[0] * step;
        StringBuilder sb = new StringBuilder();
        for (String s : inps) {
            sb.append(first).append(" ");
            first = first + step;
        }
        return sb.toString().trim();

    }
}
