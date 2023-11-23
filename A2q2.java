import java.util.Scanner;
public class A2q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius , length ,area,volume;
        System.out.println("Enter the radius and length of cylinder :");
        radius = input.nextDouble();
        length = input.nextDouble();
        area = radius * radius * 3.14;
        volume = area * length;
        System.out.println("Area of cylinder "+area+"\nVolume of cylinder = "+ volume);


    }
    
}
