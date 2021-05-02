public class test {


    public static void main(String[] args) {

     formula_1 araba1 = new formula_1(4,"mercedes",false,200,"hamilton",300,60);
     formula_1 araba2 = new formula_1(4,"ferrari",false,200,"Vettel",400,60);


    araba1.hiz_arttir();
    araba1.hiz_arttir();
    araba1.pit_stop();
    araba2.pit_stop();

     if (araba2.finish()>araba1.finish()){

         System.out.println(araba1.getPilot()+"mercedes kazandi");

     }else if(araba1.finish() == araba2.finish()){
         System.out.println("berabere");
     }else{
         System.out.println(araba2.getPilot()+"ferrari kazandi");
     }









    }
}
