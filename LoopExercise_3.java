import java.util.Scanner;
public class LoopExercise_3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int sum=0,i;
       System.out.println("Enter the number::");
       int num = input.nextInt();
               for(i=1;i <num;i++){
                  if( num % i == 0){
                     sum =sum+i;
                }
            }
                System.out.println(sum);
        }
    }

