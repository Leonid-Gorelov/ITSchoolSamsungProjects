import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println(((x * x + y * y < 1 && y < 1 && y > x - 1 && y >= 0 && x >= 0) ||
                (x * x + y * y > 1 && y < 1 && y > x - 1 && y >= 0 && x >= 0) ||
                (x * x + y * y < 1 && y < 1 && y > x - 1 && y <= 0 && x >= 0) ||
                (x * x + y * y < 1 && y < 1 && y < x - 1 && y <= 0 && x >= 0)) ? "YES" : "NO");
    }
}
