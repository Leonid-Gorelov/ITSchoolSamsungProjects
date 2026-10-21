import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println(((y > 2 * x * x && y > 1 - x && x <= 1 && x <= 0 && y >= 0) ||
                (y > 2 * x * x && y > 1 - x && x <= 1 && x >= 0 && y >= 0) ||
                (y < 2 * x * x && y > 1 - x && x <= 1 && x >= 0 && y >= 0)) ? "YES" : "NO");
    }
}
