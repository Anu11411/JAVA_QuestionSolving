import java.util.Scanner;
public class A3q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.println("Enter any character ::::");
        char c =input.next().charAt(0);
        
        int d =c;
        System.out.println(d);

        if(d >=65  && d <=90){
            System.out.println("Capital Letter.");
         } else if(d >= 97 && d<=122){
            System.out.println("small case letter");
        }
        else if(d >=48 && d<=57){
            System.out.println("a digit");
        }
        else if((d>= 0 && d<=47)||(d>= 58 && d<=64) ||(d>= 91 && d<=96)||(d>= 123 && d<=127)){
            System.out.println("Special symbol.");
        }
        }

    

    }
    

