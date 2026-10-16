import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] cards = new int[count];
        int[] foundedNumbers = new int[count];
        int[] allNumbers = new int[count];

        for (int i = 0; i < count - 1; i++) {
            cards[i] = input.nextInt();
        }

        for (int i = 0; i < count; i++) {
            allNumbers[i] = i + 1;
        }

        for (int i = 0; i < count; i++) {
            boolean isFound = false;
            for (int j = 0; j < count; j++) {
                if (allNumbers[i] == cards[j]) {
                    isFound = true;
                }
            }

            if (!isFound) {
                System.out.println(allNumbers[i]);
            }
        }

//        for (int i = 0; i < cards.length; i++) {
//            //boolean isFound = false;
//
//            for (int j = 1; j <= cards.length + 1; j++) {
//                if(cards[i] == j){
//                    //System.out.println(j);
//                    for (int k = 0; k < foundedNumbers.length; k++) {
//                        if(foundedNumbers[k] == 0){
//                            foundedNumbers[k] = cards[i];
//                        }
//                    }
//                }
//            }
//
////            if(!isFound){
////                System.out.println(cards[i]);
////            }
//        }
    }
}
