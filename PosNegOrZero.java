import java.io.*;
public class PosNegOrZero {
    public static void main(String args[])throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(input.readLine());

        if(num > 0){
            System.out.println(num+" is positive");
        }else if(num < 0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }
}
