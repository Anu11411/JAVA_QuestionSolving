import java.util.Scanner;
public class Codes_dopesq4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number whose factoiral you want :::");
        int num = input.nextInt();
        int i;
        int factoiral=1;
        for( i =1 ;i <=num;i++){
    factoiral= i*factoiral;

        }
        System.out.println(factoiral);
    }
    
}
