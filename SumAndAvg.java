import java.io.*;
public class SumAndAvg {
    public static void main(String args[])throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        System.out.println("Enter the value of n: ");
        int n = Integer.parseInt(input.readLine());
        int sum = 0,avg,num;
        //int a[] = new int[n];
        System.out.println("Enter "+n+" numbers");
        for(int i = 0;i<n ;i++){
            num = Integer.parseInt(input.readLine());
            sum = sum + num;
        }
        avg = sum / n;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
    }
}
