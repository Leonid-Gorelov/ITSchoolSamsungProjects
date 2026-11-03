import java.util.Arrays;

public class App12 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 9};
//        rotRight(numbers);
//        System.out.println(Arrays.toString(numbers));
        rotLeft(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void rotLeft(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
        }
    }

    private static void rotRight(int[] numbers) {
        int lastNumber = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = numbers[0];
        numbers[0] = lastNumber;

        for (int i = numbers.length - 2; i > 0; i--) {
            int temp = numbers[i + 1];
            numbers[i + 1] = numbers[i];
            numbers[i] = temp;
        }
    }
}
