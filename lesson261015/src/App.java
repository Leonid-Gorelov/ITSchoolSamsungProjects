import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        for (int i = 0; i < 10; i = i + 1){
//            System.out.println(i);
//        }

        /*for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;

            System.out.println(i);
        }*/

        //int[] array = new int[4];
        //int[] array = new int[] {10, 18, 9, 8};
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
