import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println(((x * x + y * y < 1 && y >= 0 && x <= 0 && y > x && y > -x) ||
                (x * x + y * y < 1 && y >= 0 && x >= 0 && y > x && y > -x) ||
                (x * x + y * y < 1 && y >= 0 && x >= 0 && y < x && y > -x) ||
                (x * x + y * y < 1 && y <= 0 && x >= 0 && y < x && y > -x) ||
                (x * x + y * y < 1 && y <= 0 && x >= 0 && y < x && y < -x) ||
                (x * x + y * y < 1 && y <= 0 && x <= 0 && y < x && y < -x)) ? "YES" : "NO");
    }
}
