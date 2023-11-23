import java.util.Scanner;
public class A2q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 ,y1,x2,y2 ,x3 ,y3 ,s, a,b,c , area;
        System.out.println("Enter the first point");
        x1 = input .nextDouble() ;
        y1 = input.nextDouble();
         System.out.println("Enter the second point");
        x2 = input .nextDouble() ;
        y2 = input.nextDouble();

         System.out.println("Enter the third point");
        x3 = input .nextDouble() ;
        y3 = input.nextDouble();
        a = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2 -y1,2),0.5);
        b =  Math.pow(Math.pow(x2-x3,2)+Math.pow(y2 -y3,2),0.5);
        c =  Math.pow(Math.pow(x1-x3,2)+Math.pow(y1 -y3,2),0.5);
        s = (a+b +c)/2;
      area = Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);      
   System.out.println("Area of triangle is :::"+ area);
    }
    
}
