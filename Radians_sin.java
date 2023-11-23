import java.util.Scanner;
public class Radians_sin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter only floating type value and the angle is in degree:");
        double a = input.nextDouble();

        double b =Math.toRadians(a);
        System.out.println(" Degree value of angle a is "+b);
        System.out.println("sin value of angle in radian is +");
        System.out.println(Math.sin(b));
    }
    
}
