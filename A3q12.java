import java.util.Scanner;
public class A3q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a, b,c respectively:");
        int a =input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
         int max =Math.max(a,(Math.max(b,c)));
         int min =Math.min(a,Math.min(b,c));
         int median = (a+b+c) -max - min ;
         System.out.println(max +" "+ median +" "+ min);
    }
    
}
