import java.util.Scanner;
public class ch4_q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1(latitude and longitude) in degrees ::");
        double point1_latitude_x1 = input.nextDouble();
        double point1_longitude_y1 = input.nextDouble();

        System.out.print("Enter point 2(latitude and longitude) in degrees ::");
        double point2_latitude_x2 = input.nextDouble();
        double point2_longitude_y2 = input.nextDouble();
         double Earth_radius = 6371.01;
        double greatCircleDistance;
        greatCircleDistance = ((Earth_radius )* (Math.acos(Math.sin(Math.toRadians(point1_latitude_x1)))) * (Math.sin(Math.toRadians(point2_latitude_x2))))+((Math.cos(Math.toRadians(point1_latitude_x1))) *(Math.cos(Math.toRadians(point2_latitude_x2))) * ( Math.cos((Math.toRadians(point1_longitude_y1) - Math.toRadians(point2_longitude_y2)))));
System.out.println("The distance between the two points is "+ greatCircleDistance +" km");
    }
    
}
