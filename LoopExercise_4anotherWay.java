import java.util.Scanner;
public class LoopExercise_4anotherWay {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter an Integer.");
       int N = input.nextInt();
       int i;
       int sum =0;
    for(i=1; i<=N;i++){
        if(N%i == 0){
            sum = sum+i;
        }
    }
            if(sum == N+1)
                System.out.println(N+" is Prime");
            else
            System.out.println(N+" is not prime");
        
    }
    }

