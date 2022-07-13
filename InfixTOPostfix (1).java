import java.util.Scanner;
import java.util.Stack;

public class InfixTOPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix");
        String str = sc.nextLine();
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'
                    || str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                System.out.print(str.charAt(i));
            } else {
                if (stk.empty()) {
                    stk.push(str.charAt(i));
                } else {
                    switch (str.charAt(i)) {
                        case '/':
                            stk.push(str.charAt(i));
                            break;
                        case '*':
                            stk.push(str.charAt(i));
                            break;
                        case '%':
                            stk.push(str.charAt(i));
                            break;
                        case '+':
                            stk.push(str.charAt(i));
                            break;
                        case '-':
                            stk.push(str.charAt(i));
                            break;
                        default:
                            break;
                    }

                }
            }

        }
        for (int i = stk.size(); i > 0; i--) {
            System.out.print(stk.pop());
        }
        sc.close();
    }
}