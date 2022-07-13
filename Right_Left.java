import java.util.Scanner;

public class Right_Left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++){
            if(a[i]<0){
                System.out.print(" " + a[i]);
            }
        }
        for(int i = 0;i<n;i++){
            if(a[i]>=0){
                System.out.print(" " + a[i]);
            }
            

        }
        sc.close();
        
    }
    
}
