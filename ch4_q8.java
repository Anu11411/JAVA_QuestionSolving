import java.util.Scanner;
public class ch4_q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code :");
        int ASCII_CODE = input.nextInt();
        System.out.println("The character for ASCII code "+ ASCII_CODE + " is "+ (char)(ASCII_CODE));
    }
    
}
