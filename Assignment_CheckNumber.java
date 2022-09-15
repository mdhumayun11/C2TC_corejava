import java.util.Scanner;

/*write a program to check if a number is positive, negative or zero using a nested IF statement.
 */
public class Assignment_CheckNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your Number");
            int num = in.nextInt();
            if(num>0)System.out.println("Number is positive");
            if(num<0)System.out.println("Number is negetive");
            if(num==0)System.out.println("Number is Zero");
        }
    }
}
