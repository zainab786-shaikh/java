import java.io.DataInputStream;
import java.io.IOException;
public class squareRoot {
    public static void main(String args[]) {
        try {
            DataInputStream dataInputStream = new DataInputStream(System.in);
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(dataInputStream.readLine());
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);
            dataInputStream.close();
        } catch (IOException e) {}
    }
}
