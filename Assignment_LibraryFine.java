import java.util.Scanner;

/*A library charges a fine for books returned late as given below.
 Design a program to calculate the fine for N days.
 */
/* First 5 days
Rs 1 per day
Next Five days
Rs 5 per day
Above 10 days
Rs 10 per day
 */

public class Assignment_LibraryFine {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter number days you took to return the book");
            int days = in.nextInt();
            if(days<=5){
                int fine = 1*days;
                System.out.println("You will pay a fine of Rs: "+fine);
            }
            else if(days>5&&days<=10){
                int fine = 5*days;
                System.out.println("You will pay a fine of Rs: "+fine);
            }
            else{
                int fine = 10*days;
                System.out.println("You will pay a fine of Rs: "+fine);
            }
        }
    }
}
