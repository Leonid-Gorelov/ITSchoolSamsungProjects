public class App {
    public static void main(String[] args) {
//        int[][] array = new int[3][4];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 100);
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//
//            System.out.println();
//        }
        
//        int[][] array = new int[5][];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = new int[(int) (Math.random() * 10) + 1];
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 100);
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//
//            System.out.println();
//        }
//    }

        int[][][] array = new int[5][4][3];

//        for (int i = 0; i < array.length; i++) {
//            array[i] = new int[(int) (Math.random() * 10) + 1];
//        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + "\t");
                }
            }

            System.out.println();
        }
    }
}
