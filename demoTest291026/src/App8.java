import java.util.Arrays;

public class App8 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        rotRight(array);
        System.out.println(Arrays.toString(array));
    }

    private static void rotRight(int[] array) {
        int lastElement = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = lastElement;

        for (int i = array.length - 2; i > 0; i--) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }
}
