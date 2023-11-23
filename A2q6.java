import java.util.Scanner;
public class A2q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight_pounds ,h_m, w_kg,height_inches,BMI;
          System.out.println("Enter the Weight in pounds and height in inches ::");
        weight_pounds = input.nextDouble();
        height_inches= input.nextDouble();
        w_kg = weight_pounds * 0.45359237;
        h_m = height_inches * 0.254;
        BMI = (w_kg) /Math.pow(h_m,2);
        System.out.println("BMI of a persong is "+ BMI);
    }
    
}
