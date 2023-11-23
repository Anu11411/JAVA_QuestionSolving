import java.util.Scanner;
public class ch5_q{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
      int num = input.nextInt();
      int sum;
      sum = num;
    do{
      System.out.println("Enter the number:");
      num = input.nextInt();
       sum = sum+num;
    }while(num != 0);
    System.out.println("Sum of these numbers is :"+sum);
  }
}