import java.util.Scanner;
public class ch4_q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Employee's name :");
        String name= input.nextLine();
        System.out.println("Number of hours worked in a week : ");
        int work_hour = input.nextInt();
        System.out.println("Hourly per rate ");
        double hour_perRate = input.nextDouble();
        System.out.println("Fedral tax withholdingrate ");
        Double federal_tax = input.nextDouble();
        System.out.println("State tax withholding rate ");
        double state_tax = input.nextDouble();
        
    }
    
}
