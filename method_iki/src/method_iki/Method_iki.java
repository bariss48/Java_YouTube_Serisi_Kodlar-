
package method_iki;

/**
 *
 * @author BARIŞ
 */
public class Method_iki {

    public static void main(String[] args) {
        
        fibonacci(10);
        System.out.println();
        System.out.println(  faktoriyel(10) );
        
    }
    
    public static void fibonacci(int adim){
        
      // 1 1 2 3 5 8 13 21 34
        
      int önceki = 1;  
      int simdiki = 1;
      int toplam = 0;
      
       System.out.print(önceki+"-"+simdiki+"-"); 
      
      
        while(0<adim){
            
            toplam = önceki + simdiki;
            önceki = simdiki;
            simdiki = toplam;
           
            adim--;
            
            System.out.print(toplam+"-"); 
        }
      
    }
    
     public static int faktoriyel(int sayi){
         
         int toplam = 1;
         
         while(0<sayi){
             
             toplam = toplam * sayi;
             
             sayi--;
             
         }
         
         
         return toplam;
         
     }
    
    
    
}
