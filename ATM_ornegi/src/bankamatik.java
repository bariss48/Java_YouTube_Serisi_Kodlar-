
import java.util.Scanner;

public class bankamatik {

    /**
    author ßÆRI$
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        int bakiye = 100;
        System.out.println("Başlangıç bakiyemiz: "+bakiye);
        
        while(true){
            
            System.out.println("1.işlem:Para Yatır"+" "+"2.işlem:Para Çek"+" "+"3.işlem:Bakiye Güncelle"+"4.işlem:Çıkış");
            
            int karar = input.nextInt();
            
            switch(karar){
                case 1:
                    System.out.println("Yatırılacak miktarı giriniz: ");
                    int yatırılacak_miktar = input.nextInt();
                    bakiye += yatırılacak_miktar;
                    System.out.println("Yeni bakiyemiz: "+bakiye);
                    break;
                case 2:
                    System.out.println("Çekilecek miktarı giriniz: ");
                    int cekilecek_miktar = input.nextInt();
                    if(cekilecek_miktar > bakiye){
                        
                        System.out.println("YETERSİZ BAKİYE!!!");
                        
                    }else{
                    bakiye -= cekilecek_miktar;
                    System.out.println("Yeni bakiyemiz: "+bakiye);
                    }
                    break;
                case 3:
                    System.out.println("Güncel bakiyenizi giriniz: ");
                    int yeni_bakiye = input.nextInt();
                    bakiye = yeni_bakiye;
                    System.out.println("Yeni bakiyemiz: "+bakiye);
                    break;
            }
            
            if(karar == 4){
                
                System.out.println("ÇIKIŞ YAPILIYOR...");
                
                break;
               
            }
            
            
        }
        
        
        
    }
    
        
    }



