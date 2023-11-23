import java.util.*;
public class A2q15 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two values a and b :::");
        
        a =Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        int range =  b- a +1;
        int random = (int)(Math.random() * range)+a;
        System.out.println(random);
    }
    
}
