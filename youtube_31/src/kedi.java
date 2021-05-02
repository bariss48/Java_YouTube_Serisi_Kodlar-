public class kedi extends hayvan {

    public kedi() {
    }

    public kedi(int ayak_sayisi, int tür, String cinsiyet) {
        super(ayak_sayisi, tür, cinsiyet);
    }


    public void hareket_et(){

        System.out.println("kedi hareket ediyor..."+super.getTür());

    }

    public void ayak_sayısı(int ayak_sayisi){

        System.out.println(ayak_sayisi);
        System.out.println("ben kedi sınıfa aitim");

    }
    public void ses_çıkar(){
        System.out.println("miyav miyav...");
    }



}
