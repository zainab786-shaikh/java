import java.io.*;
public class LargestOf3 {
    public static void main(String args[])throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        System.out.println("Enter three numbers:");
        int no1 = Integer.parseInt(input.readLine());
        int no2 = Integer.parseInt(input.readLine());
        int no3 = Integer.parseInt(input.readLine());

        if(no1 > no2 && no1 > no3){
            System.out.println("Largest no is: "+no1);
        }else if(no2 > no3){
            System.out.println("Lagest no is:" +no2);
        }else{
            System.out.println("Largest no is:" + no3);
        }
    }
}
