import java.util.Scanner;
public class OrderTwoCities {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   System.out.println("Enter the name of first city:::");
    String city_1_name= input.nextLine();
    System.out.println("Enter the name of secnd city:::");
    String city_2_name = input.nextLine();
    if((city_1_name.compareToIgnoreCase(city_2_name )==0) ){
        System.out.println("both  city are same");
    }
        else if((city_1_name.compareToIgnoreCase(city_2_name ) <0) ){
            System.out.println("ist is "+city_1_name+"  and then \n"+city_2_name);
        }
        else
         System.out.println("Ist is "+city_2_name+"  and then \n"+city_1_name);

    }
  }  

