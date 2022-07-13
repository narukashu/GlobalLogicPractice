import java.util.Scanner;

public class Two_Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size row in an array: ");
        int n = sc.nextInt();
       System.out.println("Enter the size of coloumn in an array: "); 
       int m = sc.nextInt();
       int [][] a = new int [n][m];
       for(int i=0;i<n;i++){
           for(int j = 0;j<m;j++){
               a[i][j] = sc.nextInt();
           }
       }

       int sum = 0;
       for(int i=0;i<n;i++){
        for(int j = 0;j<m;j++){
            sum +=a[i][j];
        }
    }
    System.out.println(sum);
    sc.close();
    }
}
