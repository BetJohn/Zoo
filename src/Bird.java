public class Bird  extends  Animal{
    private int maxAltitude;
    private boolean chirps;
    private boolean fly;
    private String wingsColor;

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public boolean Chirps() {
        return chirps;
    }

    public void setChirps(boolean chirps) {
        this.chirps = chirps;
    }

    public boolean canFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public String getWingsColor() {
        return wingsColor;
    }

    public void setWingsColor(String wingsColor) {
        this.wingsColor = wingsColor;
    }

    public Bird(String name, int age, String breed, int maxAltitude, boolean chirps, boolean fly, String wingsColor) {
        super(name, age, breed);
        this.maxAltitude = maxAltitude;
        this.chirps = chirps;
        this.fly = fly;
        this.wingsColor = wingsColor;
    }

    public Bird(int maxAltitude, boolean chirps, boolean fly, String wingsColor) {
        this.maxAltitude = maxAltitude;
        this.chirps = chirps;
        this.fly = fly;
        this.wingsColor = wingsColor;
    }

}
