public class Loop19 {
    public static void main(String[] args) {
        int i =1;
        int j =20;
        int k =31;
        while(i < j){
            k += (i * j); 
            i = i* 2;
            j--;
        }
        System.out.println("i="+i+"j = "+j+"k="+ k);
    }
    
}
