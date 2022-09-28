import java.util.Scanner;
import java.lang.Math;

/*Define a class Circle with the following data members: (i) Radius (ii) Colour

Create these member methods for this class: (i) getInput() that accepts the details
of the circle (ii) calcArea that calculates the area of the circle using the radius and
displays the same. */
public class Con_Circle {
    float radius;
    String colour;
    public void getInput(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius");
            radius = sc.nextFloat();
            System.out.println("Enter the colour");
            colour = sc.next();
        }
    }
    public void calcArea(){
        double area = Math.PI*(radius*radius);
        System.out.println("Area of the circle is: "+area);
        System.out.println("Colour of the circle is: "+colour);
    }
    public static void main(String[] args) {
        Con_Circle obj = new Con_Circle();
        obj.getInput();
        obj.calcArea();
    }
}
