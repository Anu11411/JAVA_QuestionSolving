import java.util.Scanner;
public class A3q3 {
public static void main(String[] args) {
    System.out.println("Enter the marks of a student::");
    Scanner input = new Scanner(System.in);
    int marks;
    marks =input.nextInt();
    if(marks >=40)
    System.out.println("\"Congratulation! You have passed the exam.\"");
    else
    System.out.println("\" Sorry! You have failed the exam.\"");
}    
}
