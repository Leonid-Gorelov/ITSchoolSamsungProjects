import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        int d = 0;
        int x = 0;

        for(; x % d != 0 && d < x; d++){
            if(x >= 500) break;

            //x += c * 2;
        }

        Scanner scanner = new Scanner(System.in);
        int c = 0;
        //int x = scanner.nextInt();
//        do {
//            c++;
//            x++;
//        } while (x < 100);

        while (x < 100) {
            c++;
            x++;
        }

        if(c == 0){
            c++;
            x++;
        }

        System.out.println(c + " " + x);
    }
}
