public class App7 {
    public static void main(String[] args) {
        int[][] a = {{11, 23, 14, 17, 35, 16, 18},
                {13, 45, 34, 9, 29, 37, 99},
                {15, 77, 68, 13, 3, 55, 63},
                {10, 42, 71, 5, 18, 4, 17},
                {34, 1, 26, 65, 71, 33, 85},
                {16, 17, 36, 94, 67, 81, 15},
                {14, 2, 87, 22, 11, 78, 5},
        };

        for (int i = 0; i < a.length; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    if (j % 2 == 0) {
                        System.out.print(a[i][j] + " ");
                    }
                }

                System.out.println();
            }
        }
    }
}
