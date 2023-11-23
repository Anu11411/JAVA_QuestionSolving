import java.util.Scanner;
public class ch4_q24{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first city");
        String a = input.nextLine();
        System.out.println("Enter the second city:");
        String b = input.nextLine();
       System.out.println("Enter the third city ");
       String c = input.nextLine();
//here we assume that a is the smallest city.
       if((a.compareToIgnoreCase(b)<=0) && (a.compareToIgnoreCase(c)<=0)){
        if(b.compareToIgnoreCase( c)<=0){
            System.out.println("Cities in ascending order is :"+a+" "+c+" "+b);
        }
        else{
      System.out.println("Cities in ascending order is :"+a+" "+b+" "+c);
        }
       }
       //here we assume that b is the smallest city.
      else if((b.compareToIgnoreCase(a)<=0) && (b.compareToIgnoreCase(c)<=0)){
        if(a.compareToIgnoreCase( c)<=0){
            System.out.println("Cities in ascending order is :"+b+" "+c+" "+a);
        }
        else{
      System.out.println("Cities in ascending order is :"+b+" "+a+" "+c);
        }}
        else{
          if(a.compareToIgnoreCase(b)<=0){
            System.out.println("cities in ascending order is "+c+" "+ a+" "+b);
          }
          else{
            System.out.println("Cities in ascending order is "+c+" "+b+" "+a);
          }
       }
    }
}