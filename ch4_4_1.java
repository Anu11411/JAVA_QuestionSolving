import java.util.Scanner;
public class ch4_4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center of a pentagon to a vertex :");
        double r=input.nextDouble();
        double s = 2*r*Math.tan(Math.toRadians(Math.PI/5));
        double area = (5 * Math.pow(s,2)) /(4*Math.tan(Math.toRadians(Math.PI/5)));
        System.out.println("The area of the pentagon is "+ area);

    }
    
}
