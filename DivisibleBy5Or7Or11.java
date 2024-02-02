import java.io.*;
public class DivisibleBy5Or7Or11 {
    public static void main(String args[])throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(input.readLine());

        if(num % 5 == 0){
            System.out.println(num+" is divisible by 5");
        }else if(num % 7 == 0){
            System.out.println(num+" is divisible by 7");
        }else if(num % 11 == 0){
            System.out.println(num+" is divisible by 11");
        }else{
            System.out.println(num+" is not divisible by 5, 7 and 11");
        }
    }
}
