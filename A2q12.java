import java.util.Scanner;
public class A2q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     int no_of_eggs , egg_in_gross,remaining_eggs ,egg_in_dozens;
    System.out.println("How many eggs do you have???");
    no_of_eggs=input.nextInt();
      egg_in_gross = no_of_eggs /144;
    no_of_eggs = no_of_eggs % 144 ;
    egg_in_dozens= no_of_eggs /12 ;
    remaining_eggs = no_of_eggs %12;
    
    System.out.println("your number of eggs "+egg_in_gross+" gross ,"+ egg_in_dozens +" dozen,and" + remaining_eggs+" are reamining eggs" );

    egg_in_gross = no_of_eggs /144;
}
    
}
