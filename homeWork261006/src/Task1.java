import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        boolean result = x >= 3 && x <= 8;

        System.out.println(result);
    }
}
