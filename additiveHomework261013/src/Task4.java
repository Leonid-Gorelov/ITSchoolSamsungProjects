import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int currentNumber = 10000;
        boolean isFound = false;

        while (currentNumber < 99999) {
            if (currentNumber % a == b && currentNumber % c == d) {
                System.out.print(currentNumber + " ");
                isFound = true;
            }

            ++currentNumber;
        }

        if (!isFound) {
            System.out.println(-1);
        }
    }
}
