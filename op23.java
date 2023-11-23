public class op23 {
    public static void main(String[] args) {
        int a = 4;
        int b =5;
        int x =(a++ < b)?a:b;
        int y = a+b-x;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    
}
