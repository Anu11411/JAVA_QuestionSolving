public class Loop39 {
     public static void main(String[] args) {
        int i,j;
        for(i=0;i<3;i++){
            for(j=1;j<4;j++){
              i %=j;
              System.out.println(j);
            }
        }
     }
    
}
