public class test{

    public static void main(String[] args) {

        tv televizyon = new tv("History Channel",30,"samsung",123515,20,false);

        televizyon.turnON();
        televizyon.volume_up();
        televizyon.volume_down();
        televizyon.volume_down();
        televizyon.change_channel();
        televizyon.turnOff();
        televizyon.volume_down();
        televizyon.turnON();
        televizyon.change_channel();
        televizyon.change_channel();

        System.out.println(televizyon.getVolume());
        System.out.println(televizyon.getChannel_number());
        System.out.println(televizyon.getChannel());




    }




}

