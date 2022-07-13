import java.util.Scanner;

public class Max {
    static int large(int b){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[b];
        for(int i = 0;i<b;i++){
            a[i] = sc.nextInt();
            sc.close();
        }
        for(int i=0;i<b;i++){
            if(a[i]>b){
                b = a[i];
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = large(n);

        System.out.print("max"+ c);
        sc.close();

    }

}
