import java.util.Scanner;
public class A2q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        double side, area;
        System.out.println("Enter the side of a hexagon :");
        side = input.nextDouble();
        area = (3* Math.pow(3,(0.5)) * Math.pow(side,2))/2;
         System.out.println("Area of HEXAGON is :"+area);
    }
}
