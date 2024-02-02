import java.io.*;
public class oddNOs {
    public static void main(String args[])throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Enter the limit: ");
        int limit = Integer.parseInt(input.readLine());
        int sum = 0;
        for(int i = 1;i<=limit;i++){
            if(i%2 != 0){
                System.out.print(i + " ");
                sum = sum+i;
            }
        }
        System.out.println("\n Sum of all the odd nos between 1 to "+limit+ " = "+sum);
    }
}
