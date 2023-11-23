public class Loop32 {
    public static void main(String[] args) {
        int i =3;
        int j=5;
        do{
            System.out.println(i * j);
        }while( ++i < --j);
    }
    
}
