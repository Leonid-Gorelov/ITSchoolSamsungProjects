import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        char[] lineChars = line.toCharArray();
        int maxLength = 1;
        int currentLength = 0;
        String wordWithMaxLength = String.valueOf(lineChars[0]);
        String currentWord = "";

        for (int i = 0; i < lineChars.length; i++) {
            if (lineChars[i] == ' ' || i == lineChars.length - 1) {

                if(i == lineChars.length - 1){
                    ++currentLength;
                    currentWord += lineChars[i];
                }

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    wordWithMaxLength = currentWord;
                }

                currentLength = 0;
                currentWord = "";
            } else {
                currentWord += lineChars[i];
                ++currentLength;
            }
        }

        System.out.println(wordWithMaxLength + "\n" + maxLength);
    }
}
