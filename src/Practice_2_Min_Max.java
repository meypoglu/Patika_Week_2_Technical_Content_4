import java.util.Arrays;
import java.util.Scanner;

public class Practice_2_Min_Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int inp = input.nextInt();
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        int diffHolderMax = max;
        int diffHolderMin = max;
        int diffHolderMinIndex = 0;
        int diffHolderMaxIndex = 0;
        for (int i = 0;i < list.length;i++) {
            if (list[i] > inp) {
                if (list[i] - inp < diffHolderMax) {
                    diffHolderMax = list[i] - inp;
                    diffHolderMaxIndex = i;
                }
            } else if (list[i] < inp) {
                if (inp - list[i] < diffHolderMin) {
                    diffHolderMin = inp - list[i];
                    diffHolderMinIndex = i;
                }
            }
        }
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen sayı: " + inp);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[diffHolderMinIndex]);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[diffHolderMaxIndex]);
    }
}
