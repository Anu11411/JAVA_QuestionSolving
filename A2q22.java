public class A2q22 {
    public static void main(String[] args) {
        int t =Integer.parseInt(args[0]);
        int P =Integer.parseInt(args[1]);
        double r =Double.parseDouble(args[2]);
        double monthly_payment = P * Math.exp(r* t);
        System.out.println(monthly_payment);
    }
    
}
