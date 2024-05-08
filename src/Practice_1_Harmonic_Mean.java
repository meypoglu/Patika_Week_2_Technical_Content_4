public class Practice_1_Harmonic_Mean {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        float sum = 0;
        for (float number : numbers) {
            sum += (1 / number);
        }

        System.out.println(numbers.length / sum);
    }
}
