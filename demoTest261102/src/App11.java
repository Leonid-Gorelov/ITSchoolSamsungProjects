public class App11 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
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
