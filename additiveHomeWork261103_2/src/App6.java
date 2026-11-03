import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.next();
        char[] lineChars = line.toCharArray();

        for (int i = 0; i < lineChars.length; i++) {
            for (int j = 0; j < lineChars.length; j++) {
                if (lineChars[i] == lineChars[j] && i != j) {
                    System.out.println(lineChars[i]);
                    return;
                }
            }
        }
    }
}
