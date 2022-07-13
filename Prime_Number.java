import java.util.Scanner;

public class Prime_Number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be check: ");
        int check = sc.nextInt();
        if(check <=1){
            System.out.println("Negative numbers are not prime");
        }
        else{
            if(check==2 || check==3)
            {
                System.out.println("Entered number is prime");
            }
           else{
            for(int i=2;i<check;i++){
                if(check % i == 0){
                    System.out.println("not prime");
                }
            }
           }   
    }
       
        sc.close();
    }
}
