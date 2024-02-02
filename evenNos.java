import java.io.*;
public class evenNos {
    public static void main(String args[])throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Enter the limit:");
        int limit = Integer.parseInt(input.readLine());
        for(int i = 1;i <= limit;i++){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
    }
}
