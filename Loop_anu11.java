import java.util.Scanner;
public class Loop_anu11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to find square root ::");
        int num = input.nextInt();
        int i;

        for(i=0; i <=num; i++){
            System.out.println("Square root of "+i + "="+(i*i));
        }
    }
    
}
