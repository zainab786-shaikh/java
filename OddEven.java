import java.util.*;
public class OddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is odd or even: ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " is an odd number");

        }


    }
}