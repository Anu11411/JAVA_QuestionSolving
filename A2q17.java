public class A2q17 {
    public static void main(String[] args) {
        int side_1,side_2,side_3;
        
         side_1 = Integer.parseInt(args[0]);
        
         side_2= Integer.parseInt(args[1]);
         side_3= Integer.parseInt(args[2]);
          
         boolean c = (side_3 >= (side_1+side_2)) ||  (side_2 >= (side_1+side_3)) || (side_1 >= (side_3+side_2));
         System.out.println(c);

    }
    
}
