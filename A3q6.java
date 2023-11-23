import java.util.Scanner;
public class A3q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        double a = input.nextDouble();

        System.out.println("Enter the value of b:");
        double b = input.nextDouble();
        System.out.println("Enter the value of c:");
        double c = input.nextDouble();
System.out.println("Enter the value of d:");
        double d = input.nextDouble();
        System.out.println("Enter the value of e:");
        double e = input.nextDouble();
        System.out.println("Enter the value of f:");
        double f = input.nextDouble();
        
        if((a *d) - (b*c) == 0){
            System.out.println("The equation has no solution.");
        }
        
    double value1 = (a*f - c*e)/(a*d - b*c);
        double value2 = (e*d - b*f)/a*d -b*c;
  System.out.println("One root is "+value1);
  System.out.println("second root is "+value2);

    }
    
}
