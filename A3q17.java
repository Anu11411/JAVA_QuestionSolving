import java.util.Scanner;

public class A3q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("Enter an integer:::");
          int num =  input.nextInt();
      if( num %5== 0 && num%6==0){
        System.out.println("Number is divisible by 5 and 6.");
      }     
      if(num %5== 0 || num%6==0){
       System.out.println("Number is divisible by 5 or 6.");
      }
       if(num %5== 0 ^ num%6==0){
       System.out.println("Number is divisible by 5 or 6 but not both.");
       }
    }
    
}
