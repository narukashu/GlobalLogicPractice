          public class airthmaticOprators {
    public static void main(String[] args) {
        int x = 40;
        int y = 20;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        int z = x + y * 10;
        System.out.println(z);
        z = x++;
        System.out.println(z + " " + x);
        z = ++x;
        System.out.println(z + " " + x);
    }
}