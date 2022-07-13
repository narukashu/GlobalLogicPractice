public class constructor1 {
    public static void main(String[] args) {
        defaultConstructor d = new defaultConstructor();
        d.print();
    }
}
class defaultConstructor{
    int x,y;
    void print(){
        System.out.println(x + " " + y);
    }
}