import java.util.Scanner;
public class ch4_q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first String :");
        String s1 = input.nextLine();
        System.out.println("Enter second String :");
        String s2 = input .nextLine();
       if(s1.contains(s2)){
        System.out.println("s2 is substring of s1");
       }
       else{
        System.out.println("s2 is not substring of s1.");
       }

    }
    
}
