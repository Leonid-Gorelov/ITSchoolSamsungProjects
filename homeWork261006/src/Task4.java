import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        boolean result = (x / 100 > 0 && x / 1000 < 1 ) && (x % 5 == 0);

        System.out.println(result);
    }
}
