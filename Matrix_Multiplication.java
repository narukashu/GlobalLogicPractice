import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of a row in a Ist Matrix: ");
        int n = sc.nextInt();

        System.out.print("Enter the size of a coloumn in a Ist Matrix: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.print("Enter the elements in a Ist matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }

        }

        System.out.print("Enter the size of a row in a Ist Matrix: ");
        int o = sc.nextInt();

        System.out.print("Enter the size of a coloumn in a Ist Matrix: ");
        int p = sc.nextInt();
        int[][] b = new int[o][p];
        System.out.print("Enter the elements in a matrix");
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }

        }
        if (m == o) {
            int[][] c = new int[n][p];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < p; j++) {
                    for (int k = 0; k < o;k++) {
                        c[i][j] += a[i][k] * b[k][j];

                    }

                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.println(c[i][j]);
                }

            }

        }
        sc.close();
        ;

    }

}
