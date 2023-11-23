import java.util.Scanner;
public class A2q133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;
        System.out.println(minutes + "minutes is approximately " + years + " years and " + days + " days");
    }
}
