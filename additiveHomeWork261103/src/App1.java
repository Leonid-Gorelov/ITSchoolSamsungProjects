import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        char[] numberChars = Integer.toString(number).toCharArray();

        for (int i = 0; i < numberChars.length; i++) {
            for (int j = 0; j < numberChars.length; j++) {
                if (numberChars[i] == numberChars[j] && i != j) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
