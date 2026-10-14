import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        do {
            int number = input.nextInt();
            ++count;

            if (number < 0) {
                break;
            }
        } while (true);

        System.out.println(count);
    }
}
