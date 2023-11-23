import java.util.Scanner;
public class A317 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();
        if((number % 5 == 0) &&(number % 6 == 0)){
            System.out.println("Number is divisible by 5 and 6 ");
        }
        if((number % 5 == 0) ||(number % 6 == 0)){
            System.out.println("Number is divisible by 5 or 6 ");
        }
        if(((number % 5 == 0) ^(number % 6 == 0))){
            System.out.println("Divisible by 5 or 6 but not both.");
        }
    }
    
}
