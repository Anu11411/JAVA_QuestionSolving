import java.util.Scanner;
public class ch4_q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character :");
        char c = input.next().charAt(0);
        System.out.println("The unicode for the character "+ (int)c);
    }
    
}
