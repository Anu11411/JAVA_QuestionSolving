public class Loop62 {
    public static void main(String[] args) {
        int i =0;
        for(i = 1; i <= 6; i++){
            if( i % 3 == 0)
            continue;
            System.out.println(i+" ,");
        }
    }
    
}
