import java.util.Scanner;

/*Define a class Commission described as follows:

Data Members: Name, Address, Phone, Sales_amount

Member methods:

(i) To accept details of the sales employee

(ii) to calculate the commission as follows: Sales_amount >= 100000, commission
= 10%; 50000 <= Sales_amount < 100000, commission = 5%; 30000 <=
Sales_amount < 50000, commission = 3%; Sales_amount < 30000, no
commission.

Write the main method to create an object of a class and call the above member
method. */
public class Con_Commission {
    public Con_Commission(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Name");
            String name = sc.nextLine();
            System.out.println("Enter address");
            String address = sc.nextLine();
            System.out.println("Enter phone number");
            long phone = sc.nextLong();
            System.out.println("Enter sales amount");
            int Sales_amount = sc.nextInt();
            int amount = Sales_amount;
      System.out.println("Name: "+name);
            System.out.println("Address: "+address);
            System.out.println("Phone Number: " +phone);
            System.out.println("Sales amount: "+amount );
            System.out.println("According to your sales amount your");
            
      if(amount>=100000){
            System.out.println("commission = 10%");
      }
      else if(amount>=50000 && amount<100000 ){
            System.out.println("commission = 5%");
      }
      else if(amount>=30000 && amount<50000){
            System.out.println("commission = 3%");
      }
      else{
            System.out.println("No commission");
      }
        }
    }
    
    public static void main(String[] args) {
        new Con_Commission();

    }
}
