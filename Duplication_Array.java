import java.util.Scanner;

public class Duplication_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the elements in an array: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int j = 0;
        for(int i=j+1;i<n-1;i++){
         if(a[i]==a[j]){
         System.out.println(a[i]+ " is Duplicate");
            j++;
        }
    }

        sc.close();
    }
    
}
