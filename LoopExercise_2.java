import java.util.Scanner;
public class LoopExercise_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             int sum=0;
             while(sum <=100){
                System.out.println("Enter the Integer::");
                int num = input.nextInt();
                 sum=sum+num;
                
             }
            System.out.println("Done"+sum);
            }
}
