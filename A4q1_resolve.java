import java.util.Scanner;
public class A4q1_resolve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Message that you want to print::");
        String message = input.nextLine();
        int count =1;
        while(count <=10){
            if(count ==1){
                System.out.println(count+"st"+message);
            }
           else if(count ==2){
                System.out.println(count+"nd"+message);
            }
           else if(count == 3){
                System.out.println(count+"rd"+message);
            }
            else{
                System.out.println(count + "th"+message);
            }
            count++;
        }
    }
    
}
