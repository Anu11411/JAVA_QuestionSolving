import java.util.Scanner;
public class A4q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number whose multiplication you want to print::");

        int n = input.nextInt();
        int i,table;
        for(i = 1 ;i <= 10 ; i++){
          table = n * i ;  
          System.out.println(n +" * " + i + " = "+ table);
        }
    }
    
}
