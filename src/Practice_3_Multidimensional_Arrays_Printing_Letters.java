import java.util.Arrays;

public class Practice_3_Multidimensional_Arrays_Printing_Letters {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];
        double midRow = (int) Math.ceil(letter.length / 2f) - 1;
        System.out.println(midRow);

        for (int i = 0;i < letter.length;i++) {
            for (int j = 0;j < letter[i].length;j++) {
                if (i == 0 || i == letter.length - 1 || i == midRow) {
                    letter[i][j] = "* ";
                } else {
                    if (j == 0 || j == letter[i].length - 1) {
                        letter[i][j] = "* ";
                    } else {
                        letter[i][j] = "  ";
                    }
                }
            }
        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
    }
}
}
