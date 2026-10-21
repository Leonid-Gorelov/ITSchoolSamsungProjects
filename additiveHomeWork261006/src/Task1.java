import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println((x < 2 && x > y && x * x + y * y > 4 && y > 0) ? "YES" : "NO");
    }
}
