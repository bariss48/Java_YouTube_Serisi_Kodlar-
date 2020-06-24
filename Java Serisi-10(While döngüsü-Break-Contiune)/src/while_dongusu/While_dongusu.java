
package while_dongusu;


public class While_dongusu {

    public static void main(String[] args) {
      
        
    int ikinci_sayi= 20;    
    int sayi = 1;
    int toplam = 0;  
    int adim_sayisi=0;
      
    while(true){
        
        if(sayi % 1081 == 0){
            
            break;
        }
      
      sayi++;
      adim_sayisi++;
    }
  
    System.out.println(adim_sayisi);

    while(ikinci_sayi>0){
        
        if(ikinci_sayi == 10 || ikinci_sayi == 11 || ikinci_sayi == 9){
            
            ikinci_sayi--;
            
            continue;
           
        }
        
        toplam += ikinci_sayi;
        ikinci_sayi--;
       
    }
    
    System.out.println(toplam);
  
}
}
    
    

