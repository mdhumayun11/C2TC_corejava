//Generating the first n natural numbers
import java.util.Scanner;

public class Assignment_FirstN_naturalnum {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a natural number");
            int num = in.nextInt();
            for(int i=0;i<num;i++){
                System.out.println(i);
            }
        }
    }
}
