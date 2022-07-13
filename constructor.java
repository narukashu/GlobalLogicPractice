public class constructor {
    public static void main(String[] args) {
compound c1 = new compound(10,20);
c1.prints();
    }
}
class compound{
    int x,y;
    compound(int a,int b){
        x = a;
        y = b;
    }
    void prints(){
        System.out.println(x + " " + y);
    }
}
