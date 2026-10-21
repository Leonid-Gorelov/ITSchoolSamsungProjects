import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] numbers = new int[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
