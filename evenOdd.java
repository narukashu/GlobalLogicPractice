import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The number you want to check :");
        int n = s.nextInt();
        if(n%2==0){
            System.out.println("Number is EVEN");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
