import java.util.*;
public class vowel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check whether the character is a vowel or not: ");
        char ch = sc.next().charAt(0);

        switch(ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");      
                break;
            default:
                System.out.println(ch + " is not a vowel");
                break;    
        }

    }
}