import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a);
        }
        else {
            if(b > a) {
                System.out.println(b);
            }
            else {
                System.out.println("Равны");
            }
        }*/
        int month = input.nextInt();

        switch (month){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            default:
                System.out.println("Нет такого месяца");
                break;
        }
    }
}
