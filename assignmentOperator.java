public class assignmentOperator {
    public static void main(String[] args) {
        int x = 10, y = 5, z;
        x += y;
        System.out.println(x);
        x /= y;
        System.out.println(x);
        z = x = y;
        System.out.println(z);
    }
}