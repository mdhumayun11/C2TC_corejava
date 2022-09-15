//Write a Java program to check if a number is a multiple of 3 or otherwise.
import java.util.Scanner;
public class Assignment_MultipleOfThree {
    public static void main(String[] args) {
       System.out.println("Enter the Number");
       try (Scanner in = new Scanner(System.in)) {
        int num = in.nextInt();
           if(num%3==0){
            System.out.println("This number is multiple of 3");
           } 
           else{
            System.out.println("This number is not a multiple of 3");
           }
    }
    }
}

