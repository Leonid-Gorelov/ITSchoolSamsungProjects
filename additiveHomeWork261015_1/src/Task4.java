import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
