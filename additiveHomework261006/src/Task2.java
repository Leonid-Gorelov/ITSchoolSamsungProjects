import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println((y >= 0 && y < .5 && y < Math.sin(x) && x >= 0 && x <= Math.PI) ? "YES" : "NO");
    }
}
