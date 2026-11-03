import java.util.Arrays;

public class App11 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[a.length - i -1];
        }

        System.out.println(Arrays.toString(b));
    }
}
