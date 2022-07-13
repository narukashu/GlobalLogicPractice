import java.util.Scanner;

public class Two_D_Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row in an array: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of coloumn in an array: ");
        
        int m = sc.nextInt();

        int[][] a = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
           
        }
        System.out.println("Enter the value to be found: ");
        int found = sc.nextInt();

        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(a[i][j]==found){
                    System.out.print("Element found " + found);
                }
                else{
                    System.out.print("Not found");
                }
            }
        }

        sc.close();
        
    }
    
}
