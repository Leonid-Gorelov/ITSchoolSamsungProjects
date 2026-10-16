import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] numbers = new int[length];
        int summary = 3 * 100000;
        int count = 0;

        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                if (summary == 3 * 100000) {
                    summary = 0;
                }

                summary += numbers[i];
                ++count;
            }
        }

        double medium = summary * 1.0 / count;
        medium = Math.round(medium * 100) / 100.0;

        System.out.println(summary != 3 * 100000 ? medium : "NO");
    }
}
