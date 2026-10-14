import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 100 == 11 || number % 100 == 12 || number % 100 == 13 || number % 100 == 14) {
            System.out.println(number + " TORTOV");
            return;
        }

        System.out.print(number + " ");

        switch (number % 10) {
            case 1:
                System.out.print("TORT");
                break;
            case 2:
            case 3:
            case 4:
                System.out.print("TORTA");
                break;
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.print("TORTOV");
                break;
        }
    }
}
