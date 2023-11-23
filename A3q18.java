import java.util.Scanner;
public class A3q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the gender of a person:");
        String gender= input.nextLine();
        System.out.println("Enter the first name of a person:");
        String first_name = input.nextLine();
        System.out.println("Enter the last name of a person:");
        String last_name = input.nextLine();
        System.out.println("Enter the age of a person:");
        int age = input.nextInt();
        System.out.println("Enter the married status:");
        String married =input.nextLine();
       
        
 if(gender.equals("Female") && (age >=20)){
            
            if(married.equals("Yes")){
                System.out.println("Mrs."+first_name+" "+last_name);
            }
            else{
                System.out.println("Ms."+first_name+" "+last_name);
            }
        }
        else if(gender.equals("Female") && (age <20)){
            System.out.println(first_name+last_name);
        }
       else if(gender.equals("Male") && (age >=20)){
        System.out.println("Mr."+first_name+last_name);

    }
    
}}
