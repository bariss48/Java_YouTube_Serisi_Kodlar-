public class köpek extends hayvan{

    public köpek() {
    }

    public köpek(int ayak_sayisi, int tür, String cinsiyet) {
        super(ayak_sayisi, tür, cinsiyet);
    }

    public void ses_çıkar(){
        System.out.println("hav hav hav");
    }

    public void ayak_sayısı(int ayak_sayisi){

        System.out.println(super.getAyak_sayisi());


    }

    public void hareket_et(){

        System.out.println("köpek hareket ediyor"+super.getTür());

    }





}
