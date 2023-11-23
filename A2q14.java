public class A2q14 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two positive integers::");
        a =Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        if( (a%b == 0) || (b%a == 0))
        System.out.println(true);
        else
        System.out.println(false);
    }
    
}
