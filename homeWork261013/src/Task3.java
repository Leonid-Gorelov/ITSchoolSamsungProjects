import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int summary = 0;

        do {
            int number = input.nextInt();

            if (number >= 100 || number < 10) {
                break;
            }

            int tempNumber = number;

            while (tempNumber > 0) {
                summary += tempNumber % 10;
                tempNumber /= 10;
            }

        } while (true);

        System.out.println(summary);
    }
}
