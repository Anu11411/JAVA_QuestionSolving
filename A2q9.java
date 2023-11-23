import java.util.Scanner;
public class A2q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first point :");
        double x1,y1,x2,y2,distance;
        double result;
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Enter the second point :");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
   
         //result =  Math.sqrt((x2 -x1)) + Math.sqrt((y2 -y1));
         //distance =Math.pow(result,0.5);
        distance = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2 -y1,2),0.5);
         System.out.println("Distance between two points :::"+distance); 
    }
}
