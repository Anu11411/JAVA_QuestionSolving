import java.util.Scanner;
public class A1q4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number ,result , last_num ,middle_num,first_num;
    System.out.println("Enter the number :");
    number = input.nextInt();
    result = number / 10;
    last_num = number % 10;
    first_num = result / 10;
    middle_num = result %10;
    System.out.println("If  and integer "+ number+" , the sum of all its digits is "+(first_num+last_num+middle_num));

}
}