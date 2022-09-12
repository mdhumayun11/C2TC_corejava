import java.util.Scanner;

public class PracticeCommit {
    public static void main(String args[]){ 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter Gender");
        char gender = sc.next().charAt(0);
        System.out.println("Enter Cgpa");
        float cgpa = sc.nextFloat();
       System.out.println("Name: "+name);
       System.out.println("Age: "+age);
       System.out.println("Gender: "+gender);
       System.out.println("Located at: "+location);
       System.out.println("CGPA "+cgpa);
  } 
}
