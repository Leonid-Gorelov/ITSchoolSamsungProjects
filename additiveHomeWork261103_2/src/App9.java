import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.next();
        int sdvig = input.nextInt();
        char[] lineChars = line.toCharArray();
        char[] literas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < lineChars.length; i++) {

            if ((int) lineChars[i] - sdvig < 65) {
                int currentIndex = 0;

                for (int j = 0; j < literas.length; j++) {
                    if (lineChars[i] == literas[j]) {
                        currentIndex = j;
                    }
                }

                lineChars[i] = literas[literas.length - sdvig + currentIndex];
            } else {
                lineChars[i] -= sdvig;
            }

            System.out.print(lineChars[i]);
        }
    }
}
