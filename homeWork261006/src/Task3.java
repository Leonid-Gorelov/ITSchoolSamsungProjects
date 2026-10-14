import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        boolean result = !((x >= -2 && x <= 3) || (x >= 6 && x <= 9));

        System.out.println(result);
    }
}
