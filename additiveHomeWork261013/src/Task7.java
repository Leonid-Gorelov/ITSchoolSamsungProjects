import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int currentNumber = 2;

        while (currentNumber < number) {
            if (number % currentNumber == 0) {
                System.out.println("composite");
                return;
            }

            ++currentNumber;
        }

        System.out.println("prime");
    }
}
