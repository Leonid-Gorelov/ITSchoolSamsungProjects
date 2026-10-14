import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = "";

        if (number < 4) {
            for (int i = 0; i < number; i++) {
                result += "I";
            }
        } else if (number == 4) {
            result = "IV";
        } else if (number >= 5 && number <= 8) {
            result = "V";

            for (int i = 5; i < number; i++) {
                result += "I";
            }
        } else if (number == 9) {
            result = "IX";
        } else if (number >= 10 && number <= 13) {
            result = "X";

            for (int i = 10; i < number; i++) {
                result += "I";
            }
        } else if (number == 14) {
            result = "XIV";
        } else if (number >= 15 && number <= 18) {
            result = "XV";

            for (int i = 15; i < number; i++) {
                result += "I";
            }
        } else if (number == 19) {
            result = "XIX";
        } else if (number >= 20 && number <= 23) {
            result = "XX";

            for (int i = 20; i < number; i++) {
                result += "I";
            }
        } else if (number == 24) {
            result = "XXIV";
        } else if (number >= 25 && number <= 28) {
            result = "XXV";

            for (int i = 25; i < number; i++) {
                result += "I";
            }
        } else if (number == 29) {
            result = "XXIX";
        } else if (number >= 30 && number <= 33) {
            result = "XXX";

            for (int i = 30; i < number; i++) {
                result += "I";
            }
        } else if (number == 34) {
            result = "XXXIV";
        } else if (number >= 35 && number <= 38) {
            result = "XXXV";

            for (int i = 35; i < number; i++) {
                result += "I";
            }
        } else if (number == 39) {
            result = "XXXIX";
        } else if (number >= 40 && number <= 43) {
            result = "XL";

            for (int i = 40; i < number; i++) {
                result += "I";
            }
        } else if (number == 44) {
            result = "XLIV";
        } else if (number >= 45 && number <= 48) {
            result = "XLV";

            for (int i = 45; i < number; i++) {
                result += "I";
            }
        } else if (number == 49) {
            result = "XLIX";
        } else if (number >= 50 && number <= 53) {
            result = "L";

            for (int i = 50; i < number; i++) {
                result += "I";
            }
        } else if (number == 54) {
            result = "LIV";
        } else if (number >= 55 && number <= 58) {
            result = "LV";

            for (int i = 55; i < number; i++) {
                result += "I";
            }
        } else if (number == 59) {
            result = "LIX";
        } else if (number >= 60 && number <= 63) {
            result = "LX";

            for (int i = 60; i < number; i++) {
                result += "I";
            }
        } else if (number == 64) {
            result = "LXIV";
        } else if (number >= 65 && number <= 68) {
            result = "LXV";
            for (int i = 65; i < number; i++) {
                result += "I";
            }
        } else if (number == 69) {
            result = "LXIX";
        } else if (number >= 70 && number <= 73) {
            result = "LXX";

            for (int i = 70; i < number; i++) {
                result += "I";
            }
        } else if (number == 74) {
            result = "LXXIV";
        } else if (number >= 75 && number <= 78) {
            result = "LXXV";

            for (int i = 75; i < number; i++) {
                result += "I";
            }
        } else if (number == 79) {
            result = "LXXIX";
        } else if (number >= 80 && number <= 83) {
            result = "LXXX";

            for (int i = 80; i < number; i++) {
                result += "I";
            }
        } else if (number == 84) {
            result = "LXXXIV";
        } else if (number >= 85 && number <= 88) {
            result = "LXXXV";

            for (int i = 85; i < number; i++) {
                result += "I";
            }
        } else if (number == 89) {
            result = "LXXXIX";
        } else if (number >= 90 && number <= 93) {
            result = "XC";

            for (int i = 90; i < number; i++) {
                result += "I";
            }
        } else if (number == 94) {
            result = "XCIV";
        } else if (number >= 95 && number <= 98) {
            result += "XCV";

            for (int i = 95; i < number; i++) {
                result += "I";
            }
        } else if (number == 99) {
            result = "XCIX";
        } else if (number == 100) {
            result = "C";
        }

        System.out.println(result);
    }
}
