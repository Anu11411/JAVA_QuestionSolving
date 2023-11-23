public class Loop31 {
    public static void main(String[] args) {
        int i =1,j=1;
        for( ; ;){
            if(i>5)
            break;
            else
            j +=1;
            System.out.println(j);
            i +=j;
        }
    }
    
}
