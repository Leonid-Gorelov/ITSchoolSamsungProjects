import java.util.Scanner;

public class MyArrays1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println(avgOf4Digit(numbers));
    }

    public static double avgOf4Digit(int[] numbers) {
        double sum = 0;
        int count = 0;

        for (int number : numbers) {
            if (number >= 1000 && number <= 9999) {
                sum += number;
                ++count;
            }
        }

        return sum > 0 ? Math.round(sum / count * 100) / 100.0 : -1;
    }
}
