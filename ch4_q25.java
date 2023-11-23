public class ch4_q25{
    public static void main(String[] args) {
        int ch1 = 65+ (int)(Math.random()*(90-65+1));
         char c1=(char)ch1;
       int ch2 = 65+ (int)(Math.random()*(90-65+1));
        char c2=(char)ch2;
       int ch3 = 65+ (int)(Math.random()*(90-65+1));
       char c3=(char)ch3;
      int num1 = (int)(Math.random()*(9+1));
      System.out.println(num1);
      int num2 =(int)(Math.random()*(9+1));
      int num3 = (int)(Math.random()*(9+1));
      int num4 = (int)(Math.random()*(9+1));
       System.out.println("Plate Number is "+c1+c2+c3+num1+num2+num3+num4);
    }
}