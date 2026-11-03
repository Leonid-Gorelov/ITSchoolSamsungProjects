public class App9 {
    public static void main(String[] args) {
        int[] a = {};
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 == 0) {
                c++;
            }
        }
    }
}
