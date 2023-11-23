import java.util.Scanner;
public class A2q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double investment_amount ,monthly_interest_rate, annual_interest ,no_of_years, future_Investment_value ;
        System.out.println("Please enter investment amount:");
        
        investment_amount =input.nextDouble();
     System.out.println("Please enter annual interest rate ::");
     annual_interest = input.nextDouble();
     monthly_interest_rate = annual_interest /1200;
     System.out.println("Enter number of years:");

     no_of_years=input.nextDouble();
    
     future_Investment_value = investment_amount *Math.pow(1+monthly_interest_rate,no_of_years*12);

     System.out.println("Investement amount entered is "+investment_amount + ", annual interest rate is "+ annual_interest + "and number of years is "+ no_of_years+ " , the future investment value is "+investment_amount);
    }
    
}
