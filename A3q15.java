import java.util.Scanner;
public class A3q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x-coordinate.");
        double x = input.nextInt();

        System.out.println("Enter the y coordinate.");
        double y = input.nextInt();

        double dist_fromCenter = Math.pow((Math.pow(x,2)+Math.pow(y,2)),0.5);
         System.out.println("Distance from center of a circle to the given points are:::" +dist_fromCenter);
       double radius = 10;

       if(radius> dist_fromCenter){
        System.out.println("Points are inside the cirlce.");
       }
        else{
            System.out.println("Points are outside of a cirlce.");
        }
        }
    }
    

