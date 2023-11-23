import java.util.Scanner;
public class A2q19 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     System.out.println("Enter the basic salar of a person :::"); 
    double basic_salary =input.nextDouble();
    double DA = basic_salary * 0.4 ;
    double HRA = basic_salary * 0.2;
    double gross_salary = basic_salary + HRA + DA;
    System.out.println("His gross salary is :::"+ gross_salary);

}
    
}
