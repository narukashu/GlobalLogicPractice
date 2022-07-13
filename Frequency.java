import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        } 

        var frequency = 0;

        System.out.println("Enter the number whose frequency to be found:");
        int check = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(a[i] == check){
                frequency++;
            }
    
        }
        System.out.println("Frequency of entered number is" + frequency);
        sc.close();
    }
    
}
