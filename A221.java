public class A221 {
       public static void main(String [] args){
         double t;
         t = Double.parseDouble(args[0]);
         t= Math.toRadians(t);
         double s =Math.sin(2*t) +Math.sin(3*t);
        System.out.println(s);
       }
    
}
