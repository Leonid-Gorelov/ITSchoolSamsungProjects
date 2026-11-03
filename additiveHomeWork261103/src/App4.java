import java.util.Arrays;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfTypeOne = input.nextInt();
        int countOfTypeTwo = input.nextInt();
        int countOfTypeThree = input.nextInt();
        int allCount = input.nextInt();

        int count = 0;

        for (int multiplayerOne = 0; multiplayerOne <= allCount / countOfTypeOne; multiplayerOne++) {
            for (int multiplayerTwo = 0; multiplayerTwo <= allCount / countOfTypeTwo; multiplayerTwo++) {
                for (int multiplayerThree = 0; multiplayerThree <= allCount / countOfTypeThree; multiplayerThree++) {
                    if (multiplayerOne * countOfTypeOne + multiplayerTwo * countOfTypeTwo + multiplayerThree * countOfTypeThree == allCount) {
                        ++count;
                    }
                }
            }
        }

        System.out.println(count);

        for (int multiplayerOne = 0; multiplayerOne <= allCount / countOfTypeOne; multiplayerOne++) {
            for (int multiplayerTwo = 0; multiplayerTwo <= allCount / countOfTypeTwo; multiplayerTwo++) {
                for (int multiplayerThree = 0; multiplayerThree <= allCount / countOfTypeThree; multiplayerThree++) {
                    if (multiplayerOne * countOfTypeOne + multiplayerTwo * countOfTypeTwo + multiplayerThree * countOfTypeThree == allCount) {
                        System.out.println(multiplayerOne + " " + multiplayerTwo + " " + multiplayerThree);
                    }
                }
            }
        }
    }
}
