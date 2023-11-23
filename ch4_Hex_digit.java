import java.util.Scanner;
public class ch4_Hex_digit{
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Hexadecimal digit.");
    String hex = input.nextLine();
    String upper_hex = hex.toUpperCase();
    char ch = upper_hex.charAt(0);
    int chh = (int)ch;
    if(hex.length() != 1){
        System.out.println("Enter only single digit.");
    }
else if(chh >= 65 && chh <=70){
    switch(ch){
        case 'A' :
        System.out.println("Hexadecimal of " +hex +"is "+ "10");
       break;
       case 'B' :
        System.out.println("Hexadecimal of " +hex +"is 11");
       break;
       case 'C' :
        System.out.println("Hexadecimal of " +hex +"is 12");
       break;
       case 'D' :
        System.out.println("Hexadecimal of " +hex +"is 13");
       break;
       case 'E' :
        System.out.println("Hexadecimal of " +hex +"is 14");
       break;
       case 'F' :
        System.out.println("Hexadecimal of " +hex +"is 15");
       break;
    
}}
else if(chh >48 && chh < 57){
   switch(ch){
        case '0' :
        System.out.println("Hexadecimal of " +hex +"is "+ "0");
       break;
       case '1' :
        System.out.println("Hexadecimal of " +hex +"is 1");
       break;
       case '2' :
        System.out.println("Hexadecimal of " +hex +"is 2");
       break;
       case '3' :
        System.out.println("Hexadecimal of " +hex +"is 3");
       break;
       case '4' :
        System.out.println("Hexadecimal of " +hex +"is 4");
       break;
       case '5' :
        System.out.println("Hexadecimal of " +hex +"is 5");
       break;
        case '6' :
        System.out.println("Hexadecimal of " +hex +"is 6");
       break;
       case '7' :
        System.out.println("Hexadecimal of " +hex +"is 7");
       break;
       case '8' :
        System.out.println("Hexadecimal of " +hex +"is 8");
       break;
       case '9' :
        System.out.println("Hexadecimal of " +hex +"is 9");
       break;
}
    
    }
 
}
}
