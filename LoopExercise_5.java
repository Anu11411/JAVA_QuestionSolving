import java.util.Scanner;
public class LoopExercise_5 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
     int integer,max,min;
       System.out.println("Enter an integer:");
            integer = input.nextInt();
         max =integer;
         min =integer;
         while( true){
          System.out.println("Enter a integer.");
          integer = input.nextInt();
            if(integer < 0)

            break;
            if(integer > max)
            max =integer;
            if(integer <min)
            min =integer;
          } 
System.out.println("Maximum among them is"+max);
System.out.println("Minimum among them is "+min);
          
        }
    }
