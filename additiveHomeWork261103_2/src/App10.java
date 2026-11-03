import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        char[] lineChars = line.toCharArray();
        boolean isSpaceFound = false;

        for (int i = 0; i < lineChars.length; i++) {
            if(lineChars[i] != ' '){
                isSpaceFound = false;
                System.out.print(lineChars[i]);
            } else if(lineChars[i] == ' ' && !isSpaceFound){
                isSpaceFound = true;
                System.out.print(' ');
            }
        }
    }
}
