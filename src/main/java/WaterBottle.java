public class WaterBottle {

    private int waterVolume = 100;

    public int getWaterVolume(){
        return this.waterVolume;
    }

    public void drink(){
        if(this.waterVolume > 10) {
            this.waterVolume -= 10;
        }
    }
    public void empty(){
        this.waterVolume = 0;
    }

    public void fill(){
        if(this.waterVolume < 100){
            this.waterVolume = 100;
        }
    }

}
