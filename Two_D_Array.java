import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of an array: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the size of coloumn: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        
        System.out.print("Enter the values in array: ");
        for(int i = 0;i<n;i++){
          for(int j=0;j<m;j++ ){
              
            a[i][j] = sc.nextInt();
          }
        }

        System.out.println("The elements in a matrix are: ");
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++ ){
              System.out.print(" "+a[i][j]);
            }
            System.out.println();
          }


        sc.close();
    }
    
}
