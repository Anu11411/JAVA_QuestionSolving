import java.util.Scanner;

public class marks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();
        scanner.close();
        char grade;
        switch (marks / 10) {
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

        // Print the grade
        System.out.println("Grade: " + grade);
    }
}
