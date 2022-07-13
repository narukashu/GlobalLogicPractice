import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in an array: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i=1;i<n;i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = temp;
        }
        System.out.println("Sorted elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }

        sc.close();
    }
    
}
