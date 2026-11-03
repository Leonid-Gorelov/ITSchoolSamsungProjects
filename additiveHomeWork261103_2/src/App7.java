import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] directionsAndSteps = new String[0];

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] newDirectionsAndSteps = line.split(" ");
            String[] temp = new String[directionsAndSteps.length + newDirectionsAndSteps.length];

            for (int i = 0; i < directionsAndSteps.length; i++) {
                temp[i] = directionsAndSteps[i];
            }

            for (int i = directionsAndSteps.length; i < newDirectionsAndSteps.length + directionsAndSteps.length; i++) {
                temp[i] = newDirectionsAndSteps[i - directionsAndSteps.length];
            }

            directionsAndSteps = temp;
        }


        int xSteps = 0, ySteps = 0;

        for (int i = 0; i < directionsAndSteps.length - 1; i++) {
            switch (directionsAndSteps[i]) {
                case "North":
                    xSteps += Integer.parseInt(directionsAndSteps[i + 1]);
                    break;
                case "South":
                    xSteps -= Integer.parseInt(directionsAndSteps[i + 1]);
                    break;
                case "East":
                    ySteps += Integer.parseInt((directionsAndSteps[i + 1]));
                    break;
                case "West":
                    ySteps -= Integer.parseInt(directionsAndSteps[i + 1]);
            }
        }

        System.out.println(ySteps + " " + xSteps);
    }
}
