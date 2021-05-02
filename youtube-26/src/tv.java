public class tv {

    private  String channel;
    private  int channel_number;
    private  int volume ;
    private  String marka;
    private  int ID;
    private   boolean kapali = false;


    public tv(String channel, int volume, String marka, int ID,int channel_number,boolean kapali){

        this.channel = channel;
        this.ID = ID;
        this.marka = marka;
        this.volume = volume;
        this.channel_number = channel_number;
        this.kapali = kapali;

    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public int getChannel_number() {
        return channel_number;
    }

    public void setChannel_number(int channel_number) {
        this.channel_number = channel_number;
    }

    public boolean isKapali() {
        return kapali;
    }

    public void setKapali(boolean kapali) {
        this.kapali = kapali;
    }


    public void turnON(){

       this.kapali = true;
      System.out.println("televizyon aciliyor...");

    }

    public void turnOff(){


        this.kapali = false;
        System.out.println("televizyon kapaniyor...");

    }


    public  void change_channel(){

        if (kapali == true)
            channel_number++;


    }

  public  void volume_up(){

        if (kapali == true){

            this.volume++;

        }

  }

    public  void volume_down(){

        if (kapali == true && this.volume > 0){

            this.volume--;

        }

    }




}
