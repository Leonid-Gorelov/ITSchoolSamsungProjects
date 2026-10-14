import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int currentNumber = 25;
        int summary = 0;

        while (currentNumber <= number) {
            if (currentNumber % 2 == 0) {
                summary += currentNumber;
            }

            ++currentNumber;
        }

        System.out.println(summary);
    }
}
