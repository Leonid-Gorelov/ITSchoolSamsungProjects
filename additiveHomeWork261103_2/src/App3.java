import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        char[] lineChars = line.toCharArray();
        int count = 1;

        for (int i = 0; i < lineChars.length; i++) {
            if (lineChars[i] == ' ') {
                ++count;
            }
        }

        System.out.println(count);
    }
}
