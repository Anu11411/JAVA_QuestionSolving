import java.util.Scanner;
public class ch4_Hexa_Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Hexadecimal Digit : ");
        String hexa_num = input.nextLine();
        
        String new_hexa_num = hexa_num.toUpperCase();
        int leng_hexa_num = hexa_num.length();
          
         int i ;
         for( i =0;i<leng_hexa_num ;i++){
           char ch =new_hexa_num.charAt(i);
            int new_ch=(int)ch;
             if((new_ch > 65 && new_ch<70) || Character.isDigit(ch) ){

                System.out.println("Valid .");
                
             }
             else{
                System.out.println("Invalid.");
             }
        }
    }
    
   }