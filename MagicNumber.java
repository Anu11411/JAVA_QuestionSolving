import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Guess a magic number between 0 and 100.");
        int computer_Guess = (int)(Math.random()*100 +1);
        int guess = -1;
        while(guess != computer_Guess){
            System.out.print("Enter your guess::");
            guess = input.nextInt();
            if(guess == computer_Guess)
            System.out.println("Yes, the number is "+computer_Guess);
            else if(guess > computer_Guess){
                System.out.println("Your guess is too high.");

            }
            else
            System.out.println("your guess is low.");
        }
    }
    
}
