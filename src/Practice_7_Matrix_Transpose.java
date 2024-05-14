import java.util.Arrays;

public class Practice_7_Matrix_Transpose {
    public static void main(String[] args) {
        int[][] array = {{2, 3, 4}, {5, 6, 4}};
        int[][] transArray = new int[array[0].length][array.length];

        for (int i = 0;i < array.length;i++){
            for (int k = 0;k < array[i].length;k++) {
                transArray[k][i] = array[i][k];
            }
        }
        System.out.println("Matris: ");
        System.out.println(Arrays.deepToString(array));
        System.out.println("Transpoze matris: ");
        System.out.println(Arrays.deepToString(transArray));
    }
}
