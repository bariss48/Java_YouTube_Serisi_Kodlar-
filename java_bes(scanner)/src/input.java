
import java.util.Scanner;


public class input {

    
    public static void main(String[] args) {
        
        int sayi_bir;
        int sayi_iki;
        
       Scanner input = new Scanner(System.in);
      
       System.out.println("SAYI-BIRI giriniz:  ");
       sayi_bir = input.nextInt();
       System.out.println("SAYI-IKIYI giriniz:  ");
       sayi_iki = input.nextInt(); 
       System.out.println("SAYI-BIR DEGERI: "+sayi_bir); 
       System.out.println("SAYI-IKI DEGERI: "+sayi_iki);  
        
       if(sayi_bir>sayi_iki){
           
       System.out.println("SAYI-BİR SAYI-İKİDEN DAHA BÜYÜKYÜR"); 
           
           
       }else 
           
       System.out.println("SAYI-İKİ SAYI-BİRDEN DAHA BÜYÜKYÜR"); 
        
        
        
    }
    
}
