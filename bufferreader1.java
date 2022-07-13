import java.io.*;

class bufferreader1 {
 public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter a String to print ");
     String s = br.readLine();
     System.out.println("Your entered String is " + s);
 }
}