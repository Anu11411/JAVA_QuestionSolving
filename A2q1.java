import java.util.Scanner;
public class A2q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter the value of Celsius :");
         double Celsius= input.nextDouble();
         double fahrenheit;
         fahrenheit = (9/5)*Celsius+32;
         System.out.println(fahrenheit);
    }
    
}
