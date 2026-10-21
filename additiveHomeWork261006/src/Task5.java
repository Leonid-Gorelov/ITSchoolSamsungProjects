import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println(((x * x + y * y < 1 && x <= 0 && y <= 0 && y < x) ||
                (x * x + y * y < 1 && x <= 0 && y <= 0 && y > x) ||
                (x * x + y * y < 1 && x <= 0 && y >= 0 && y > x) ||
                (x * x + y * y < 1 && x >= 0 && y >= 0 && y > x)) ? "YES" : "NO");
    }
}
