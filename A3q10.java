import java.util.Scanner;
public class A3q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer for today's day(sunday(0) to saturday(6)).");
        int Today_day = input.nextInt();
           switch(Today_day){
            case 0:
             System.out.println("Today  is sunday");
             break;
             case 1:
             System.out.println(" Today is Monday.");
             break;
             case 2:
             System.out.println("Today is Tuesday.");
             break;
             case 3:
             System.out.println("Today is Wednesday.");
             break;
             case 4:
             System.out.println("Today is Thursday.");
             break;
             case 5:
             System.out.println("Future day is Friday.");
             break;
             case 6:
             System.out.println(" Today is Saturday.");
             break;
           }


            System.out.println("Enter the number of days after today for a future day ::");
         int futureday_fromtoday = input.nextInt();
          futureday_fromtoday = (Today_day+futureday_fromtoday) % 7;
         switch(futureday_fromtoday){
             case 0:
             System.out.println("Future day is sunday");
             break;
             case 1:
             System.out.println("Future day is Monday.");
             break;
             case 2:
             System.out.println("Future day is Tuesday.");
             break;
             case 3:
             System.out.println("Future day is Wednesday.");
             break;
             case 4:
             System.out.println("Future day is Thursday.");
             break;
             case 5:
             System.out.println("Future day is Friday.");
             break;
             case 6:
             System.out.println("Future day is Saturday.");
             break;
         }
        }
    
}
