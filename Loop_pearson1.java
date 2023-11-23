 import java.util.Scanner;
public class Loop_pearson1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int num1 = (int)(Math.random()*10);
         int num2 = (int)(Math.random()*10);
         System.out.println("Enter the integer::i");
        int answer = input.nextInt();
        while(num1+num2 != answer){
            System.out.println("enter the answer:");
            answer=input.nextInt();
        }
        System.out.println("YOu got your answer");
        }
    }
    

