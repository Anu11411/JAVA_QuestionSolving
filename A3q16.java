import java.util.Scanner;
public class A3q16{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks::");
        int marks = input.nextInt();
        char grade;
        switch (marks/10) {
            case 10:
            case 9:
                grade = 'O';
                break;
            case 8:
                grade = 'A';
                break;
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
                grade = 'D';
                break;
            case 4:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }

  
        System.out.println("Grade: " + grade);
          
    }
}