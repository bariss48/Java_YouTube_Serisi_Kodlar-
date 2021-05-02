import java.util.Random;

public class formula_1 {

     private int lastik_sayisi;
     private String marka;
     private boolean DRS;
     private int fuel;
     private String pilot;
     private int hiz;
     private int brake;
     private int pist = 1000;


     public formula_1(int lastik_sayisi,String marka,boolean DRS,int fuel,String pilot, int hiz,int brake){

         this.brake= brake;
         this.DRS = DRS;
         this.fuel = fuel;
         this.lastik_sayisi = lastik_sayisi;
         this.pilot = pilot;
         this.hiz = hiz;
         this.marka = marka;


     }


    public int getLastik_sayisi() {
        return lastik_sayisi;
    }

    public void setLastik_sayisi(int lastik_sayisi) {
        this.lastik_sayisi = lastik_sayisi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public boolean isDRS() {
        return DRS;
    }

    public void setDRS(boolean DRS) {
        this.DRS = DRS;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public int getBrake() {
        return brake;
    }

    public void setBrake(int brake) {
        this.brake = brake;
    }



    public int pit_stop(){

        Random rastgele = new Random();

        int pit_stop_time =  rastgele.nextInt(3)+1;
        lastik_sayisi += 4;

         System.out.println("pit stop yapiliyor...");
         return  pit_stop_time;

    }

    public void yakital(){

         this.fuel += 100;
         System.out.println( "yakit aliniyor...");
    }


    public  void  openDRS(){

         this.DRS = true;
         System.out.println("drs acik");

    }
    public  void  offDRS(){

        this.DRS = false;
        System.out.println("drs kapali");

    }


    public void hiz_arttir(){



             hiz += 30;



    }



    public  void  frenle(){

         if (this.hiz-this.brake > 0){

             this.hiz = this.hiz - this.brake;

         }

         System.out.println("fren yapiliyor...");
    }



    public int finish(){

         int sure = pist / this.hiz;
         int tut = pit_stop();

         return  sure + tut;


    }


}
