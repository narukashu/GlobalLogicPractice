import java.util.Scanner;

public class Missing_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int max = 0;
        for(int i = 0;i<n;i++){
            sum += a[i];
            if( max < a[i]){
                max = a[i];
            }
        }
        int check = max*(max+1)/2;
        if(sum == check){
            System.out.print("No number is missing");
        }
        else{
            int missing = check - sum;
            System.out.print("Missing number is " + missing);
        }

        sc.close();
    }
    
}
