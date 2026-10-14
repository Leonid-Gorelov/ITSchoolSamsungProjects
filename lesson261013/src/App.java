import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;

        /*while (count < n) {
            System.out.println(count);
            count++;
        }*/

        do {
            System.out.println(count);
            count++;

            if (count == 5) {
                break;
            }
        } while (count < n);
    }
}
