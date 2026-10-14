import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();

        double divided = Math.round((B / A) * 10) / 10.0;

        /*if (-B / A == B / A || (A <= 0 && B <= 0)) {
            System.out.println("no such x");
        } else if (-B / A < B / A) {
            System.out.println("any x");
        } else if (-B / A + B / A == 0) {
            if (A < B) {
                System.out.println((B / A) + "<x<" + -B / A);
            } else {
                System.out.println("x<" + B / A + " or x>" + -B / A);
            }
        }*/

        if (-divided == divided || (A <= 0 && B <= 0)) {
            System.out.println("no such x");
        } else if (-divided < divided) {
            System.out.println("any x");
        } else if (-divided + divided == 0) {
            if (A < B) {
                System.out.println((divided) + "<x<" + -divided);
            } else {
                System.out.println("x<" + divided + " or x>" + -divided);
            }
        }
    }
}
