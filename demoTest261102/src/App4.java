public class App4 {
    public static void main(String[] args) {
        int x = 1, y = 1, z = 1;

        if (x % 2 == 0 && y % 2 != 0 || x % 2 == 0 && z % 2 != 0 || y % 2 == 0 && x % 2 != 0 || y % 2 == 0 && z % 2 != 0 || z % 2 == 0 && x % 2 != 0 || z % 2 == 0 && y % 2 != 0) {
            System.out.println(true);
            return;
        }

        System.out.println(false);
    }
}
