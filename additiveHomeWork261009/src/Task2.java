import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();

        if (day <= 0 || month <= 0 || month > 12 || ((month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) && day > 31) ||
                ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) ||
                (month == 2 && day > 28)) {
            System.out.println(-1);
            return;
        }

        int allDays = 0;

        if (month > 1) {
            allDays += 31;
        }
        if (month > 3) {
            allDays += 31;
        }
        if (month > 5) {
            allDays += 31;
        }
        if (month > 7) {
            allDays += 31;
        }
        if (month > 8) {
            allDays += 31;
        }
        if (month > 10) {
            allDays += 31;
        }
        if (month > 12) {
            allDays += 31;
        }
        if (month > 4) {
            allDays += 30;
        }
        if (month > 6) {
            allDays += 30;
        }
        if (month > 9) {
            allDays += 30;
        }
        if (month > 11) {
            allDays += 30;
        }
        if (month > 2) {
            allDays += 28;
        }

        allDays += day;

        System.out.println(365 - allDays);
    }
}
