import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int summary = 0;

        do {
            int number = input.nextInt();

            if(number > 10){
                summary += number;
            }

            if (number % 5 == 0) {
                break;
            }
        } while (true);

        System.out.println(summary);
    }
}
