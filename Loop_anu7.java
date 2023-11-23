import java.util.Scanner;
public class Loop_anu7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter negative integer:");
        int negative_int = input.nextInt();
        int i;
        for(i=0; i >= negative_int; i-- ){
            System.out.print(i+" ");
        }
    }
    
}
