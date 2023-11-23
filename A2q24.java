public class A2q24 {
    public static void main(String[] args) {
        double r1  =Math.random();
        double r2 =Math.random();
        double r3 =Math.random();
        double r4 =Math.random();
         double r5 =Math.random();
         double average = (r1  +r2+r3+r4+r5)/5;
         double maximum_value = Math.max(r1 ,Math.max(r2,Math.max(r3,Math.max(r4,r5))));
         double mainimum_value = Math.min(r1 ,Math.min(r2,Math.min(r3,Math.min(r4,r5))));
         System.out.println("average is "+average + " Maximum among them is "+ maximum_value + "Minimum among them is "+ mainimum_value);


    }
    
}
