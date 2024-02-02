import java.io.*;
public class absoluteValue {
    public static void main(String args[])throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        System.out.println("Enter a negative number: ");
        int num = Integer.parseInt(input.readLine());        
        System.out.println("Absolute value of that number: "+Math.abs(num));
    }
}
