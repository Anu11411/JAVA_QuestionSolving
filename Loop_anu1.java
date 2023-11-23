import java.util.Scanner;
public class Loop_anu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("enter the last number upto which you want to print:");
    int n = input.nextInt();
        for( i= 1 ; i <= n; i++ ){
            System.out.print(i+" ");
        }
    }
    
}
