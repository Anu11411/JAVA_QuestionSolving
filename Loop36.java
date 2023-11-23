public class Loop36 {
    public static void main(String[] args) {
        int cnt=0;
        while(true){
            if(cnt >4)
            break;
            if(cnt == 0){
                cnt++;
                continue;
            }
            System.out.println(cnt +",");
            cnt++;
        }
    }
    
}
