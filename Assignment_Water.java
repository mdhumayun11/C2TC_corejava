import java.util.Scanner;

/*To foster a sense of water conservation, the water department has an annual water tax
policy. The rates are based on the water consumption of the consumer. The tax rates are as
follows:
Write a program in Java to compute an annual water tax chart based on input value of
water consumption.*/
/* Water consumed (in gallons)
Tax rate in Rs/100 Gallons
Up to 45
No tax
More than 45 but 75 or less
475
More than 75 but 125 or less
750
More than 125 but 200 or less
1225
More than 200 but 350 or less
1650
More than 350
2000
 */
public class Assignment_Water {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter water consumed in gallons");
            int wc = in.nextInt();
            if(wc<=45){
                System.out.println("No Tax");
            }
            else if(wc>45&&wc<75){
                System.out.println("Tax = 475");
            }
            else if(wc>75&&wc<125){
                System.out.println("Tax = 750");
            }
            else if(wc>125&&wc<200){
                System.out.println("Tax = 1225");
            }
            else if(wc>200&&wc<350){
                System.out.println("Tax = 1650");
            }
            else{
                System.out.println("Tax = 2000");
            }
        }
    }
}
