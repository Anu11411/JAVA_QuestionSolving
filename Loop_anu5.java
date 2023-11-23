import java.util.Scanner;
public class Loop_anu5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print::");
        int num=input.nextInt();
        int i;
        for(i =0; i<= num;i=i+5){
            System.out.print(i+" ");

        }
    }
    
}
