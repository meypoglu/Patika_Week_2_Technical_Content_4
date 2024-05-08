public class Practice_4_Repetitive_Elements_In_Arrays {
    public static void main(String[] args) {
        int[] list = {3, 7, 8, 3, 10, 3, 2, 9, 10, 8, 21, 1, 33, 9, 1, 2};
        for (int i = 0;i < list.length;i++) {
            if (list[i] % 2 != 0) {
                ///
            } else {
                for (int j = i + 1;j < list.length;j++) {
                    if (list[i] == list[j]) {
                        System.out.println(list[i] + " sayısı tekrar ediyor.");
                        break;
            }
                }
            }
        }
    }
}
