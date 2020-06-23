
import java.util.Scanner;


public class ıce_ıce_for {

    public static void main(String[] args) {
        
       //Mukemmel sayı    //28   1 2 4 7 14 == 28
       
       Scanner input  = new Scanner(System.in);
             
       int sayi;
       
       System.out.print("Mükemmel sayı kontrolü: ") ;
       sayi  = input.nextInt();
       
        int bolenlerin_toplamı = 0;
       
        for(int i=1;i<sayi;i++){
            
            if(sayi%i == 0){
                
             bolenlerin_toplamı += i;
               
            }
            
        }
        
        
        if(bolenlerin_toplamı == sayi){
            
            System.out.println("Sayınız bir mükemmel sayıdır...");
            
        }else{
            
              System.out.println("Sayınız bir mükemmel sayı değildir...");
        }
        
      int sayac =0; 
       
      for(int k=2;k<1000;k++){
          
          for(int h=2;h<k;h++){
              
              if(k%h == 0){
                  
                  sayac +=1;
                  
              }
             
          }
         
          if(sayac == 0) System.out.print("-"+k);
          sayac = 0;
      }  
        
       
    }
    
}
