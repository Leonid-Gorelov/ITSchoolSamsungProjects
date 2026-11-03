public class App8 {
    public static void main(String[] args) {
        int d = 123, x = 123;

        do {
            if (x % d != 0) {
                d++;
            }
        } while (d < x && x % d != 0);

        System.out.println(d + " " + x);
    }
}
