public class kuş extends hayvan {
    public kuş() {
    }

    public kuş(int ayak_sayisi, int tür, String cinsiyet) {
        super(ayak_sayisi, tür, cinsiyet);
    }


    public void ses_çıkar(){
        System.out.println("kuş ötürüyor...");
    }

    public void ayak_sayısı(int ayak_sayisi){

        System.out.println(super.getAyak_sayisi());


    }

    public void hareket_et(){

        System.out.println("kuş uçuyor..."+super.getTür());

    }






}
