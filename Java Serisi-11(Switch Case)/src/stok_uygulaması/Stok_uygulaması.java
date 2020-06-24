
package stok_uygulaması;

import java.util.Scanner;

public class Stok_uygulaması {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int ürün_Sayısı =0;
        
        int tercih;
        System.out.println("Başlangıçtaki depodaki ürün sayınız: "+ürün_Sayısı);
        System.out.println("1.tercih: Depoya ürün ekle" + " " + "2.tercih: Depodan ürün çıkar"+"  "+"3.tercih: Depodaki ürün sayısını güncelle"+"  "+"4.tercih: Çıkış yap");
        
        while(true){
        System.out.println("Tercihinizi giriniz: ");
        tercih = input.nextInt();
              
        switch(tercih){
        
        case 1:
            int eklenen_ürün;
            System.out.println("Eklenecek ürün sayısı: ");
            eklenen_ürün = input.nextInt();
            ürün_Sayısı += eklenen_ürün;
            System.out.println("Depodaki yeni ürün sayısı: "+ürün_Sayısı);
            
            break;
            
          case 2:
            int Çıkan_ürün;
            
             System.out.println("Çıkarılacak ürün sayısı: ");
             Çıkan_ürün = input.nextInt();
             if(ürün_Sayısı-Çıkan_ürün<=0){
                System.out.println("DEPO BOŞŞ!!!");
             }else{ 
            ürün_Sayısı -= Çıkan_ürün;
            System.out.println("Depodaki yeni ürün sayısı: "+ürün_Sayısı);
            }
            break;
            case 3:
            System.out.println("Deponuzdaki ürün sayısı: "+ürün_Sayısı);
            int yeni;
            System.out.println("Deponuzdaki güncel ürün sayısını giriniz: ");
            yeni = input.nextInt();
            ürün_Sayısı = yeni;
            System.out.println("Deponuzdaki güncel ürün sayısınız: "+ürün_Sayısı);
            break;
            
         
        }
        if(tercih == 4){
            System.out.println("Çıkış Yapılıyor...");
            break;
          
        }
        }
        
    }
    
}

    
    

    

