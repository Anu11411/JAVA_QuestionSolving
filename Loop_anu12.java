import java.util.Scanner;
public class Loop_anu12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to find the cube root of a number ::");
        int num = input.nextInt();
        int i=0;

        while(i <=num){
            System.out.println("cube root of "+i+"="+i*i*i);
            i++;
        }
    }
    
}
