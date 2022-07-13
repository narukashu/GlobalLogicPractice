import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        char ch = 'a';

        Character b = ch;

        ArrayList<Character> arrayList = new ArrayList<Character>();
        arrayList.add(b);

        System.out.println(arrayList.get(0));
    }
    
}