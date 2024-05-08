import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_5_Sorting_Elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();

        int[] inpArr = new int[n];
        for (int i = 0;i < n;i++) {
            System.out.println("Dizinin elemanlarını giriniz: ");
            System.out.println(i + 1 + ". Eleman: ");
            inpArr[i] = input.nextInt();
            }

        System.out.println(Arrays.toString(sorter(inpArr)));


        }

    static int[] sorter(int[] inpArr) {
        int[] sortArr = new int[2];
        int[] tempArr = Arrays.copyOf(inpArr, inpArr.length);
        for (int k = 1;k < tempArr.length;k++) {
            sortArr[0] = tempArr[k - 1];
            sortArr[1] = tempArr[k];
            if (tempArr[k] < tempArr[k - 1]) {
                tempArr[k - 1] = sortArr[1];
                tempArr[k] = sortArr[0];
            }
            sortArr = new int[2];
        }
        if (Arrays.equals(tempArr, inpArr)) {
            return inpArr;
        } else {
            return sorter(tempArr);
        }
    }
}
