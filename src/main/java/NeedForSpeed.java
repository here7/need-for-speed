class NeedForSpeed {
    private int speed = 0;
    private int batteryDrain = 0;
    public int distanceDriven = 0;
    private int batteryLevel = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (this.distanceDriven == 0 && this.batteryLevel == 100){
            return false;
        } else if(this.batteryLevel > 0 && this.batteryLevel < 100){
            return false;
        }
        return true;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(this.batteryLevel >= this.batteryDrain){
            this.distanceDriven += this.speed;
            this.batteryLevel -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50,4);
        return nitro;
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        return true;
    }
}
