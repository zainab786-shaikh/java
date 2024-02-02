import java.io.*;
public class findPrimeNo {
    public static void main(String args[])throws IOException{
            DataInputStream input = new DataInputStream(System.in);
            System.out.print("Enter a number :");
            int num = Integer.parseInt(input.readLine());
            boolean isPrime = true;
            for(int i = 2;i<num;i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num + " is prime");
            }else{
                System.out.println(num + " is not prime");
            }
    }
}
