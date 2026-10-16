import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] numbers = new int[length];
        int summary = 3 * 100000;

        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (summary == 3 * 100000) {
                    summary = 0;
                }

                summary += numbers[i];
            }
        }

        System.out.println(summary != 3 * 100000 ? summary : "NO");
    }
}
