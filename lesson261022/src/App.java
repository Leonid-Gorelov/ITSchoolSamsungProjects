import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
//        int[] array = fillRandomInt(100);
//        int[] array2 = fillRandomInt(1000);
        int[] array = new int[100];
        int[] array2 = new int[1000];
        fillRandomInt(array);
        fillRandomInt(array2);
        printArray(array);
        printArray(array2);

        int a = 100;
        test(a);
        System.out.println(a);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    //    public static int[] fillRandomInt(int length) {
//        int[] array = new int[length];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100);
//        }
//
//        return array;
//    }
    public static void fillRandomInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void test(int a){
        a = 10;
    }
}
