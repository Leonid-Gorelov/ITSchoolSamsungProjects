import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println(((y > x * x - 2 && y > x && x <= 0 && y < -x && y >= 0) ||
                (y > x * x - 2 && y > x && x <= 0 && y <= 0 && y < -x) ||
                (y > x * x - 2 && y < x && x <= 0 && y <= 0 && y < -x) ||
                (y > x * x - 2 && y < x && x >= 0 && y <= 0 && y < -x) ||
                (y > x * x - 2 && y < x && x >= 0 && y <= 0 && y > -x) ||
                (y > x * x - 2 && y < x && x >= 0 && y >= 0 && y > -x)) ? "YES" : "NO");
    }
}
