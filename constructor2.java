public class constructor2 {
    public static void main(String[] args) {
test t = new test(70,80);
t.print();
    }
}
class test{
    int x,y;
    test(int a,int b){
        x = a;
        y = b;
    }
    void print(){
        System.out.println(x + " " + y);
    }
}
