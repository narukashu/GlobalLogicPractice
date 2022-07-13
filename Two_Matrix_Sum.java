import java.util.Scanner;

public class Two_Matrix_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of a row in an array: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of a coloumn in an array: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        int[][] b = new int[n][m];

        int[][] c = new int[n][m];
        System.out.print("Enter elements in a first matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                
            }
        }
        
        System.out.print("Enter elements in a Second matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
                
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            c[i][j] = a[i][j] + b[i][j];   
            System.out.print(" "+c[i][j]);    
        }
        
        System.out.println();
        }
        sc.close();

    }

}
