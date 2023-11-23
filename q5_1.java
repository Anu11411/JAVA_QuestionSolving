import java.util.Scanner;
public class q5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter an integer::");
       int num = input.nextInt();
       while(num != 0){
        System.out.println("Enter an integer:");
        num = input.nextInt();
       }

    }
}
