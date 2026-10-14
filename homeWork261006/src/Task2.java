import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        boolean result = (x >= -3 && x <= 5) || (x >= 9 && x <= 15);

        System.out.println(result);
    }
}
