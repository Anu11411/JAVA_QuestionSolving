import java.util.Scanner;
import java.lang.Math;
public class random1 {
    public static void main(String[] args) {
        int min , max , rand ,range;
        Scanner input = new Scanner(System.in);
          
        System.out.println("Enter the value of  minimum interger:::");
     min = input.nextInt();

     System.out.println("Enter the value of maximum integer:::");
     max = input.nextInt();
    range = (max -min) + 1;

    rand = ((int)Math.random() * range) +min;
     System.out.println(rand);
}
    
}
