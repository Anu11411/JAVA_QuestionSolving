import java.util.Scanner;
public class Loop_anu10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the negative integer upto which you want to print :");
        int num =input.nextInt();
        int i;

        for(i=0 ; num <=i ;i=i-2){
            System.out.println(i);
        }
    }
    
}
