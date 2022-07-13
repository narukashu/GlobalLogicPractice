import java.util.Scanner;

public class logicalOperator1 {
    public static void main(String[] args) {
        String user = "Shubham", pwd = "Naruka";
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String pd = sc.next();
        if (user.equals(id) && pwd.equals(pd)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Try again");
        }
    }
}