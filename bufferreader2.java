import java.io.*;
class bufferReader2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Value");
        int x = Integer.parseInt(br.readLine());
        System.out.println("You enter " + x);
    }
}