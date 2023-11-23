import java.util.Scanner;
public class Angle_traingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Angle of triangle with co-oridnate inputed:");

       System.out.println("Enter the cooridnates of triangle --->");
       System.out.println("Enter the  x cooridinate of first point--> ");
       Double x1 = input.nextDouble();
        System.out.println("Enter the  y cooridinate of first point--> ");
       Double y1 = input.nextDouble();
        System.out.println("Enter the  x cooridinate of second point--> ");
       Double x2 = input.nextDouble();
        System.out.println("Enter the  y cooridinate of second point--> ");
       Double y2 = input.nextDouble();
        System.out.println("Enter the  x cooridinate of third point--> ");
       Double x3 = input.nextDouble();
        System.out.println("Enter the  y cooridinate of third point--> ");
       Double y3 = input.nextDouble();

        System.out.println("------Length of sides----- ");
        Double a = (Math.sqrt((Math.pow((x1-x2),2.0)+(Math.pow((y1-y2),2.0)))));
        Double b = (Math.sqrt((Math.pow((x2-x3),2.0)+(Math.pow((y2-y3),2.0)))));
        Double c = (Math.sqrt((Math.pow((x3-x1),2.0)+(Math.pow((y3-y1),2.0)))));
       
       System.out.println("Sides of triangle are "+ a +" , "+b+ ", "+c+", ");
      
       System.out.println("----Angle of triangle with sides are :");

       double A ,B,C;
       A = Math.toDegrees(Math.acos((b*b+c*c-a*a)/ (-2*b*c)));
        B = Math.toDegrees(Math.acos((a*a+c*c-b*b) / (-2*a*c)));
         C = Math.toDegrees(Math.acos((a*a+b*b-c*c) / (-2*a*b)));
        System.out.println("The three angles are"+Math.round(A*100)/100.0+" "+Math.round(B*100)/100.0+" "+Math.round(C*100)/100.0);
    }
}
