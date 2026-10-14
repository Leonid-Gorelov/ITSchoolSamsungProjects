import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number / 10 == 0 && number >= 0) {
            System.out.println("DIGIT");
        } else if (number / 100 == 0 && number > 0) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}
