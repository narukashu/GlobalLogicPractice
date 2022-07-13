import java.util.Scanner;

public class continueStatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
       for (int i = 0;i<=5;i++){
           if (y == 0)
               continue;
           System.out.println(x/y + " " + i);
       }
    }
}
