import java.util.Scanner;
public class A3q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight(kg) in a person ::");
        double weight = input.nextDouble();
        System.out.println("Enter the height of a person::");
        double height = input.nextDouble();
        double BMI = weight/(height*height);
        if(BMI <18.5){
            System.out.println("UnderWeight.");
        }
        else if(BMI >= 18.5 &&  BMI<=24.9){
            System.out.println("Normal Weight.");
        }
        else if(BMI >= 25.0 && BMI<=29.9){
            System.out.println("Overweight.");
        }
        else
        System.out.println("Obese");
    }
    
}
