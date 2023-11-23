import java.util.Scanner;
public class HexaDecimal_Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the HexaDecimal number:");
        String hex_num = input.nextLine();
        int length = hex_num.length();

        int i,j;
        int decimal=0;
    for( i =0; i<=length-1;i++){
        char ch = hex_num.charAt(i);
           decimal += (int)ch * 16 * i;
           System.out.println(decimal);
    }

     }
    

    }
    

