import java.io.*;

public class PrimeSeries{
    public static void main(String args[])throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Enter a number till which you want the series: ");
        int num = Integer.parseInt(input.readLine());

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + "\t ");
            }
        }
    }
}