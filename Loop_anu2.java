import java.util.Scanner;
public class Loop_anu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                                                       
      int i;
      System.out.println("Please enter the numbre::");
      int n = input.nextInt();
        for( i =1; i <= n ;i=i+2){
            System.out.print(i+" ");
        }
    }

}
