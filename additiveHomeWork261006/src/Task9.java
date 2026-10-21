import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println(((x * x + y * y < 1 && y < 1 && x <= 0 && y >= 0 && x <= 1) ||
                (x * x + y * y < 1 && y < 1 && x >= 0 && y >= 0 && x <= 1) ||
                (x * x + y * y > 1 && y < 1 && x >= 0 && y >= 0 && x <= 1) ||
                (x * x + y * y < 1 && y < 1 && x >= 0 && y <= 0 && x <= 1) ||
                (x * x + y * y < 1 && y < 1 && x <= 0 && y <= 0 && x <= 1)) ? "YES" : "NO");
    }
}
