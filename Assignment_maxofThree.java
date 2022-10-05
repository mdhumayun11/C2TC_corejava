import java.util.Scanner;

/*write a program using concatenated IF to print the maximum of 3 numbers without using
Math.max(). */


public class Assignment_maxofThree {
    public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter 1st number");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = in.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = in.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println("Maximum of 3 numbers are: "+num1); 
            }
            else{
             System.out.println("Maximum of 3 numbers are: "+num3);
            }
        }
        else if(num2>num3){
                System.out.println("Maximum of 3 numbers are: "+num2);
             }
        else {
                System.out.println("Maximum of 3 numbers are: "+num3);
                }
        
        }
    }
}

