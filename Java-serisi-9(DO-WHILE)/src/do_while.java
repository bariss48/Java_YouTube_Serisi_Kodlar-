
import java.util.Scanner;


public class do_while {

    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
    System.out.println("Sayınızı giriniz: ");
    int sayi = input.nextInt();
    int basamak_sayisi=0;    
    
    // 1/10 = 0
    
    do{
        
       sayi /= 10; 
       basamak_sayisi++;
        
    }while(sayi>0);
    
    
     System.out.print(basamak_sayisi);
        
    
        
} 

}