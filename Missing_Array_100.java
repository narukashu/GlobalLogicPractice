import java.util.Scanner;

public class Missing_Array_100 {
    public static void main(String[] args) {
       int [] a ={1,2,3,4,5,6,7,8,9,10};
       Scanner sc = new Scanner(System.in);
       int[] b = new int[10];
       System.out.println("Enter the elements to be search :");
       for(int i=0;i<10;i++){
           b[i] = sc.nextInt();
       }
       int j=0;
       System.out.println("Missing Numbers are: ");
        for(int i=0;i<10;i++){
         if(a[i]==b[j]){
        System.out.println(a[i]);
             }


}

       sc.close();
    }
    
}
