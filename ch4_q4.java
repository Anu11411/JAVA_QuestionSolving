import java.util.Scanner;
public class ch4_q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of a Hexagon ::");
        double side = input.nextDouble();
        double Area;
        Area = (6 * Math.pow(side,2)) / (4 * Math.tan(Math.PI/6));
        System.out.println("The area of the hexagon is "+ Area);
    }
    
}
