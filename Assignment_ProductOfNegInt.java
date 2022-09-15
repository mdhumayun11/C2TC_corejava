/*import java.util.Scanner;

//Accept 10 numbers and calculate the product of all the negative integers entered.
public class Assignment_ProductOfNegInt {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] array = new int[10];  
            System.out.println("Enter the elements of the array: ");  
            for(int i=0; i<10; i++){
            array[i]=sc.nextInt();
            if(array[i]<0){
                int negative = 1;
                int proneg = negative*array[i];
                System.out.println("Product of negative are: "+proneg);
            }  
            }  
            
        }  
    }
}
I need help with this*/
public class Assignment_ProductOfNegInt{
public static void main(String[] args) 
	{
		int negatives=1;
	      int  num [] = {1,2,3,4,5,6,7,-8,-9,12};

	      for(int i=0;i<num.length;i++)
	         {
	               if (num[i]<0)
	               {
	                  negatives*=num[i];
	               }
	               
	         }

	         System.out.println("The product of negatives is " + negatives);
	        
	  }

}
