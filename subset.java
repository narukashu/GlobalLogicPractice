import java.util.Scanner;

public class subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        boolean check = false;
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<arr.length;j++){
                if(a[i]==a[j]){
                    count++;
                    break;
                }
            }
        }

        if(count == a.length){
            check = true;
        }
        else{
            check = false;
        }

        if(check == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        sc.close();


    }
    
}
