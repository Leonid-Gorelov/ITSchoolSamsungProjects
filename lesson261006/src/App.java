import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean res;

        res = 4 > 5;
        res = 4 <= 5;
        res = 5 <= 5;
        res = 5 == 5;
        res = 9 != 5;
        res = !res;

        Scanner scanner = new Scanner(System.in);
        //int x = scanner.nextInt();
        //res = x > 4 && x < 10;
        //res = x <= 4 || x >= 10;

        //System.out.println(res);

        //String resString = (x <= 4 || x >= 10) ? "YES" : "NO";

        //System.out.println(resString);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println((x * x + y * y > 4) && (x < 2) && (y < x) && (y > 0) ? "YES" : "NO");
    }
}
