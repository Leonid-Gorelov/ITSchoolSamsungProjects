import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine().toLowerCase();
        char[] lineChars = line.toCharArray();

        for (int i = 0, currentIndex = lineChars.length - 1; i < lineChars.length; i++, --currentIndex) {
            while (lineChars[i] == ' ') {
                i++;
            }
            while (lineChars[currentIndex] == ' ') {
                currentIndex--;
            }

            if (lineChars[i] != lineChars[currentIndex]) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
}
