public class App5 {
    public static void main(String[] args) {
        int a = -1, b = -1;

        if (a > 0 && b < 0 || a < 0 && b > 0) {
            System.out.println(0);
        } else if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b < 0) {
            System.out.println(2);
        }
    }
}
