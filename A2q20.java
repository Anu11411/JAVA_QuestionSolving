public class A2q20 {
    public static void main(String[] args) {
         int m =Integer.parseInt(args[0]);
        int d =Integer.parseInt(args[1]);
        boolean result =( m==3 && d>=20) || (m == 4 && d <=30) ||(m==5 && d<=31)|| (m == 6 && d<=20);
       System.out.println(result);
    }
    
}
