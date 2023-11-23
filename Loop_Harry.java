import java.util.Scanner;
public class Loop_Harry {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      int n =10;
      int a,sum=0;
      for(int i =1; i <=10;i++){
        System.out.println("Enter a number ::");
        a = input.nextInt();
        sum = sum +a;
      }
        System.out.println("Average of these  10 numbers are : "+ (sum/10));   
        }
    }
    

