import java.util.Scanner;

public class Equality_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        String check = "Is Equal";
        System.out.println("Enter the elements in 1st array: ");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in 2nd array: ");
        for(int i =0;i<n;i++){
            b[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            if(a[i]!=b[i]){
                check = "Not Equal";
            }
        }
        System.out.println(check);

        sc.close();

    }
    
}
