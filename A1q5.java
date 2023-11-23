import java.util.Scanner;
public class A1q5 {
    public static void main(String[] args) {
    System.out.println("Enter the intial velocity(int meters/second) , the ending velocity(in meters/second) and the time span(in seconds) :::");
    Scanner input = new Scanner(System.in);
    double v0, v1, t , avg_acceleration;
     v0 = input.nextDouble();
     v1 =input.nextDouble();
     t = input.nextDouble();
     avg_acceleration =(v0-v1)/t;
     System.out.println("The average acceleration of a vehichle is "+avg_acceleration);
}
}