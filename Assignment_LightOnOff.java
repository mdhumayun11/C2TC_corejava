import java.util.Scanner;

/*Write a Java program that checks the time (given in a 24 Hour format) and turns
on the light switches in a smart home (program has to display lights on or lights
off).*/
public class Assignment_LightOnOff {
    public static void main(String[] args) {
        System.out.println("Enter time in 24 hr format");
        try (Scanner in = new Scanner(System.in)) {
            float time = in.nextFloat();
            if (time>=18.00||time<=6.00){
                System.out.println("Lights On");
            }
            else{
                System.out.println("Lights off");
            }
        }
    }
}
