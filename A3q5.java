import java.util.Scanner;
public class A3q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a ::");
        double a = input.nextDouble();
        System.out.println("Enter the value of b ::");
        double b = input.nextDouble();
        System.out.println("Enter the value of c ::");
        double c = input.nextDouble();
        double root1,root2;
        double discriminant = Math.pow(b,2) - (4*a*c);
        if(discriminant > 0){
               root1 = (-b + Math.pow(b*b - 4*a*c,0.5))/(2*a);
               root2 = (-b - Math.pow(b*b - 4*a*c,0.5))/(2*a);
            System.out.println("two roots are "+root1+ " ,"+root2);
        }
        else if(discriminant == 0){
             root1 = -b/2*a;
             System.out.println("One root is "+ root1);
        }
        else
        System.out.println("The equation has no real roots.");
    }
    
}
