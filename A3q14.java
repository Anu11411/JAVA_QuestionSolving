import java.util.Scanner;
public class A3q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 i.e computer :::: ");
        int Computer_Player1 =(int)(Math.random()* 3);
        switch(Computer_Player1){
           case 0 :
           System.out.println("Computer got \"Scissor\".");
           break;
            case 1 :
           System.out.println("Computer got \"Rock\".");
           break;
            case 2 :
           System.out.println("Computer got \"Paper\".");
           break;
        }
        System.out.println("Please enter 0 or 1 or 2:::");
        int user_player2 = input.nextInt();
        if(Computer_Player1  == user_player2){
         System.out.println("Draws");

        }
        else{
          boolean win= (user_player2==2 && Computer_Player1==0)||(user_player2==0 && Computer_Player1==1)||(user_player2==1 && Computer_Player1==2);
          if(win){
            System.out.println("You won.");
          }
          else{
            System.out.println("You loose.");
          }
        }


        
}
}