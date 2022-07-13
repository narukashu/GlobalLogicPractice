import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();

        } 
        
        int temp;
        for(int i = 0;i<n/2;i++){
             temp = a[i];
             a[i] = a[n-(i+1)];
             a[n-(i+1)] = temp;
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
    
}
