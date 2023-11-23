import java.util.Scanner;
public class ch5_sentinel_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("Enter the integer:");
        int integer= input.nextInt();
        int sum=integer;
        while( integer !=0 ){
            System.out.println("Enter the integer:");
            integer = input.nextInt();
            sum = sum+integer;
        }
    System.out.println("The sum is "+sum);
    }
}
