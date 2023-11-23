import java.util.Scanner;
public class A4q4 {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting number:::");
        int starting_number = input.nextInt();
        System.out.println("Enter the last number:::");
        int last_number = input.nextInt();
        System.out.println("Enter the increment that you want:::");
        int increment_value = input.nextInt();
        System.out.println(starting_number);
         for( i = starting_number ;i<=last_number; i=i+increment_value){
            System.out.print (i+" ");
         }
         
    }
    
}
