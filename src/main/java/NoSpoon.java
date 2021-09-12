public class NoSpoon {
    int height;
    int width;
    char[][] matrix;

    public NoSpoon(char[][] matrix) {
        this.matrix = matrix;
        height = matrix.length;
        width = matrix[0].length;
    }

    String[][] calculate(){
        String[][] matrix = new String[height + 1][width + 1];
        for(int i = 0; i <matrix.length;i++)
        {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = "-1 -1";
            }
        }
        return matrix;
    }





    static void debInfo(String[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.err.print(" " + m[i][j] + " ");
            }
            System.err.print("\n");
        }
    }
}
