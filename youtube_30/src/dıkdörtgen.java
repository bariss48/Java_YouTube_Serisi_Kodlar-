public class dıkdörtgen extends çokgen{

    private int uzun_kenar;

    public dıkdörtgen(){
        //default
    }

    public dıkdörtgen(int uzun_kenar){

        this.uzun_kenar = uzun_kenar;


    }

    public dıkdörtgen(int uzun_kenar,int kenar,String renk){

        super(kenar,renk);
        this.uzun_kenar = uzun_kenar;


    }




    public void rengimi_soyle(){


        System.out.println("benim rengim "+super.getRenk());
        System.out.println("benim rengim "+this.getRenk());

    }


    public int alan(){

        return uzun_kenar*super.getKenar();

    }





}
