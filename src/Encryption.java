public class Encryption {
    public static void main(String[] args) {

        System.out.print(encryption("haveaniceday"));

    }

    public static String encryption(String s) {
        // Write your code here
        String newS = "";
        String result = "";
        int row;
        int columns;


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                newS += s.charAt(i);
            }
        }

        double sqr = Math.sqrt(newS.length());
        row = (int) Math.floor(sqr);
        columns = (int) Math.ceil(sqr);

        int count = 0;

        char x[][] = new char[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                x[i][j] = newS.charAt(count);
                if (count == newS.length()) {
                    break;
                }
            }
            if (count == newS.length()) {
                break;
            }
        }

        String newResult = "";

        if (row * columns >= newS.length()) {
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < row; j++) {
                    newResult += x[j][i];

                }
                newResult += " ";

            }
        } else {
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < row; j++) {
                    newResult += x[i][j];
                }
                newResult += "\n";
            }
        }

        return newResult;
    }
}