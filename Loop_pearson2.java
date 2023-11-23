import java.util.Scanner;
public class Loop_pearson2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
             int computer = (int)(Math.random()*100 +1);
         System.out.print("Enter your guess:");
             int guess = input.nextInt();
       while(computer != guess ){
           System.out.print("Enter your guess:");
             guess = input.nextInt();
                 if(guess == computer)
                      System.out.println("Yes,the number is"+computer);
                 else if(guess > computer)
                       System.out.println("Your guess is too high");
                  else
                       System.out.println("Your guess is two low");
       }
   
    }
    
}
