import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol = input.next();

        System.out.println(changeRegister(symbol));
    }

    private static String changeRegister(String symbol) {
        if (symbol.toUpperCase() == symbol) {
            return symbol.toLowerCase();
        }

        return symbol.toUpperCase();
    }
}
