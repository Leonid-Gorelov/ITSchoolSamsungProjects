import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol = input.next();

        System.out.println(IsDigit(symbol.toCharArray()[0]) ? "yes" : "no");
    }

    private static boolean IsDigit(char c) {
        return isDigit(c, 0) || isDigit(c, 1) || isDigit(c, 2) || isDigit(c, 3) || isDigit(c, 4) ||
                isDigit(c, 5) || isDigit(c, 6) || isDigit(c, 7) || isDigit(c, 8) || isDigit(c, 9);
    }

    private static boolean isDigit(char c, int digit) {
        return c == Integer.toString(digit).toCharArray()[0];
    }
}
