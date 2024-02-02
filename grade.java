import java.io.*;
public class grade {
    public static void main(String args[])throws IOException{
        DataInputStream input = new DataInputStream(System.in);
        int s[] = new int[5];
        int total = 0;
        System.out.println("Enter marks of 5 subjects: ");
        for(int i = 0 ; i < 5;i++){
            s[i] = Integer.parseInt(input.readLine());
            total = total + s[i];
        }
        System.out.println("Total = "+ total);
        int average = total/5;
        System.out.println("Average = "+average);
        if (average >= 90) {
            System.out.println("A+ Grade");
        } else if (average >= 80) {
            System.out.println("A Grade");
        } else if (average >= 70) {
            System.out.println("B Grade");
        } else if (average >= 60) {
            System.out.println("C Grade");
        } else if (average >= 50) {
            System.out.println("D Grade");
        } else {
            System.out.println("F Grade");
        }
        
    }
}
