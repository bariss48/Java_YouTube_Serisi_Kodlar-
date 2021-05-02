public class hayvan {

    private int ayak_sayisi;
    private int tür;
    private String cinsiyet;

    public hayvan(){

    }

    public hayvan(int ayak_sayisi, int tür, String cinsiyet) {
        this.ayak_sayisi = ayak_sayisi;
        this.tür = tür;
        this.cinsiyet = cinsiyet;
    }

    public int getAyak_sayisi() {
        return ayak_sayisi;
    }

    public int getTür() {
        return tür;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setAyak_sayisi(int ayak_sayisi) {
        this.ayak_sayisi = ayak_sayisi;
    }

    public void setTür(int tür) {
        this.tür = tür;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public void ses_çıkar(){
        System.out.println("ses çıkarmıyorum");
    }

    public void ayak_sayısı(int ayak_sayisi){

        System.out.println(ayak_sayisi);


    }

    public void hareket_et(){

        System.out.println("hareket ediyorum...");

    }




}
