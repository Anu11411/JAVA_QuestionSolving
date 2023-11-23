public class co11 {
public static void main(String[] args) {
    boolean x = true;
    boolean y =false;
    if((x && y) | (x||y)){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
}    
}
