public class test {

    public static void main(String[] args) {

        kedi kedi1 = new kedi(4,300,"erkek");
        köpek köpek1 = new köpek(4,2000,"erkek");
        kuş kus1 = new kuş(2,1400,"dişi");

        kedi1.ayak_sayısı(4);
        köpek1.ayak_sayısı(718924012);
        kus1.ayak_sayısı(124214);
        kedi1.hareket_et();
        köpek1.hareket_et();
        kus1.hareket_et();
        kedi1.ses_çıkar();
        köpek1.ses_çıkar();
        kus1.ses_çıkar();


    }


}
