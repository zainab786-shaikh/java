import java.io.*;
public class Smallest {
    public static void main(String args[])throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Enter the limit: ");
        int n = Integer.parseInt(input.readLine());
        int a[]= new int[n];
        System.out.println("Enter "+n+" nos:");
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(input.readLine());
        }
        int smallest = a[0];
        for(int i = 0;i < n;i++){
            if(a[i] < smallest){
                smallest = a[i];
            }
        }
        System.out.println("Smallest no is: "+smallest);
    }
}
