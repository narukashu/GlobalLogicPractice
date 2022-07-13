import java.util.Scanner;

public class Array_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int data = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i=0 ;
        int j=n-1;
        boolean isPresent = false;

        while (i<=j){
            int mid = (i+j)/2;

            if (arr[mid] == data){
                isPresent = true;
                break;
            }else if (arr[mid] > data){
                j = mid - 1;
            }else {
                i = mid +1;
            }
        }

        if (isPresent){
            System.out.println("Present");
        }else {
            System.out.println("Not Present");
        }
    }
}
