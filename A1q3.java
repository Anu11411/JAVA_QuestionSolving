import java.util.Scanner;
public class A1q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet , meters ;
        System.out.println("Enter the number in feet :");
        feet = input.nextDouble();
        meters = feet * 0.305;
        System.out.println("Result is : "+ meters);
    }
    
}
