public class A2q16 {
    public static void main(String[] args) {
        int min =1;
        int max =6;
        int sum;
        int range = (max - min) +1;
        
        int rand_1 = ((int)Math.random() *range) + min;
        int rand_2=  ((int)Math.random() *range) + min;
        sum = rand_1 + rand_2;
        System.out.println("The sum of two random integers between 1 and 6 is ::"+sum);
    }
}
