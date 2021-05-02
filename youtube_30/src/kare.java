public class kare extends çokgen{


    public kare(){

    }


    public kare(int kenar,String renk){

        super(kenar,renk);

    }




    public void rengimi_soyle(){


        System.out.println("benim rengim "+super.getRenk());
        System.out.println("benim rengim "+this.getRenk());

    }

    public int alan(){

        return super.getKenar()*super.getKenar();

    }


}
