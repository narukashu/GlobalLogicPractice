import java.util.Scanner;

public class Search_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int [] a = new int [n];
        System.out.print("Enter the elements in an array: ");
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be found: ");
        int find = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(find == a[i]){
                System.out.println("Find element at " + i + " Index");
            }
        }
        sc.close();
    }
    
}
