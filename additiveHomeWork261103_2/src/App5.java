import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.next();
        char[] lineChars = line.toCharArray();

        for (int i = 0; i < lineChars.length; i++) {
            if (lineChars[i] != lineChars[lineChars.length - i - 1]) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
}
