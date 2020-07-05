
/**
 *
 * @author BARIŞ
 * 
 */
public class methods{

    
    public static void main(String[] args) {
        
        ismimi_yazdır("YAZILIMLA BARIŞ");
        System.out.println( karesini_al(10));
        System.out.println(ilk_harf("barış"));
        System.out.println(büyük_olanı_döndür(10,20));
        
    }
    
    
    public static void ismimi_yazdır(String isim){
        
        System.out.println(isim);
      
    }
   
     public static int karesini_al(int sayi){
        
      return sayi*sayi;
      
    }
    
    public static char ilk_harf(String kelime){
        
      char yakala = kelime.charAt(0);
      
      return yakala;
      
    }
    
    
      public static int büyük_olanı_döndür(int sayi,int sayi_iki){
        
         if(sayi>sayi_iki){
             
             
            return sayi;
             
             
         }else 
             
            return sayi_iki;
             
         
    }
    
    
}
