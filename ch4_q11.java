public class ch4_q11 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*15+1);
        System.out.println(number);
     if(number <=9){
        System.out.println("The hex value is "+ number);
     }
     else{
        if(number== 10)
        System.out.println("The hex value is A");
        else if(number == 11)
        System.out.println("The hex value is B");
         else if(number == 12)
        System.out.println("The hex value is C ");
         else if(number == 13)
        System.out.println("The hex value is D ");
         else if(number == 14)
        System.out.println("The hex value is E ");
         else if(number == 15)
        System.out.println("The hex value is F ");        
else
System.out.println("Invalid");



     }
    }  
    
}
