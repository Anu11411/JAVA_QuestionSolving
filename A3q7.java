import java.util.Scanner;
public class A3q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x-cooridinate::");
        double x = input.nextDouble();

        System.out.println("Enter the y cooridante");
        double y = input.nextDouble();

        if(x> 0 && y> 0){
            System.out.println("First quadrant.");
        }
        else if( x<0 && y>0){
            System.out.println("Second quadrant.");
        }
        else if( x<0 && y<0){
            System.out.println("Third quadrant.");
        }
        else if( x>0 && y<0){
            System.out.println("Forth quadrant.");
        }
        
        else if( x>0 && y == 0 ){
            System.out.println("positive x-axis");
        }
        else if( y>0 && x == 0 ){
            System.out.println("positive y-axis");
        }
        else if( y==0 && x<0 ){
            System.out.println("negative x-axis");
        }
        else if(y<0 && x==0){
            System.out.println("negative y-axis");
        }
        else{
            System.out.println("origin.");
        }
    }
    
}
