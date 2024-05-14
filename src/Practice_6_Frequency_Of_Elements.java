import java.util.Arrays;

public class Practice_6_Frequency_Of_Elements {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        String prevNums = "";
        int counter = 0;
        for (int i = 0;i < array.length - 1;i++) {
            if (!prevNums.contains(String.valueOf(array[i]))) {
                for (int k = i + 1; k < array.length;k++) {
                    if (array[i] == array[k]) {
                        counter += 1;
                    }
                }
            }

            if (!prevNums.contains(String.valueOf(array[i]))) {
                System.out.println(array[i] + " sayısı, dizide " + (counter + 1) + " kere tekrar ediyor.");
            }
            prevNums += "+" + array[i];
            counter = 0;
        }
    }
}