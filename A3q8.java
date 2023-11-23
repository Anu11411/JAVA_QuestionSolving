import java.util.Scanner;
public class A3q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of Rahul:");
         int age_Rahul = input.nextInt();
         System.out.println("Enter the age of Ayush:");
         int age_Ayush = input.nextInt();
         System.out.println("Enter the age of Ajay:");
         int age_Ajay = input.nextInt();
      //  int result = Math.max(age_Rahul,Math.max(age_Ajay,age_Ayush));
       // System.out.println(result);

       if(age_Rahul > age_Ayush && age_Rahul > age_Ajay){
        System.out.println("Youngest is Rahul.");
       }
        if(age_Ayush > age_Rahul && age_Ayush > age_Ajay){
        System.out.println("Youngest is Ayush.");
    }
    else
    System.out.println("Youngest is Ajay. ");
    }}
