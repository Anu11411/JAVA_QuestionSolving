import java.util.Scanner;
public class A2q13 {
    public static void main(String[] args) {
         int days ,minutes,year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minutes:::");
        minutes = input.nextInt();
        year = minutes /(365 * 24 * 60);
        days = (minutes % (360 *24 *60))/(24*60);
        System.out.println("Entered minutes is "+ minutes +" the number of years "+ year + " and days for the minutes is"+days);
        // 1year =365 days
        //        365 * 24 hour
        //        365 * 24 * 60 min

    }
    
}
