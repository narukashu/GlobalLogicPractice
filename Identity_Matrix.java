import java.util.Scanner;

public class Identity_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row in an array");
        int n = sc.nextInt();
        System.out.println("Enter the coloumn in an array");
        int m = sc.nextInt();

        int [][] a = new int[n][m];
        
        String check = "Identidy";

        if(n==m){

            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                        a[i][j] = sc.nextInt();
                }
            }

            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                   if(i==j && a[i][j] != 1){
                       check = "Not Identity";
                   }
                   else{
                       if(i!=j && a[i][j] !=0){
                           check = "Not Identity";
                       }
                   }
                }
            }
        }

        
        else{
            System.out.println("Re-Enter the matrix size in NxN form");
        }

    System.out.print(check);



        sc.close();
    }
    
}
