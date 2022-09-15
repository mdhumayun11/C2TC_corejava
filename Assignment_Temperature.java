import java.util.Scanner;

/*In the month of October, the temperature on Oct 1st was 30 ℃ and reduced by two degrees every week. 
Simulate this scenario using a for loop in Java. 
Before simulating this, you should find the final temperature.
Week 1 - 30
Week 2 - 28
Week 3 - 26
Week 4 - 24
Week 5 - 22
 */
public class Assignment_Temperature {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter Temperature");
            int temp = in.nextInt();
            int week = 5;
            for(int i=1;i<=week;i++){
                temp -=2;
                System.out.println("week "+i + " Temperature: "+temp);
            }
        }
    }
}
