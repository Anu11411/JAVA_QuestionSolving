public class LoopExercise_1 {
    public static void main(String[] args) {
         int i;
         System.out.println("Displaying even number between 1 to 100.");
        for(i =2; i<=100;i++){
            if(i % 2 == 0){
              System.out.print(i+" ");
        }
    }
    System.out.println("\n"+"\n"+"Displaying odd numbers between 1 to 100.");
    for(i =1; i<=100;i++){
            if(i % 2 != 0){
              System.out.print(+i+" ");
        }
    
    }
     System.out.println("\n"+"\n"+"Displaying even numbers between 1 to 100 in decreasing order.");
     for(i =100; i>=1;i--){
        if(i % 2 == 0){
            System.out.print(i+" ");
        }
     }
     System.out.println("\n"+"\n"+"Displaying odd numbers between 1 to 100 in decreasing order.");
     for(i =100; i>=1;i--){
        if(i % 3 == 0){
            System.out.print(i+" ");
        }
}
}
}