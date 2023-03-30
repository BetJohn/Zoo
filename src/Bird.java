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

    @Override
    public String toString() {
        return super.toString() + "Bird{" +
                "maxAltitude=" + maxAltitude +
                ", chirps=" + chirps +
                ", fly=" + fly +
                ", wingsColor='" + wingsColor + '\'' +
                '}';
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

    public Bird(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, int maxAltitude, boolean chirps, boolean fly, String wingsColor) {
        super(name, age, breed, needFoodOrWater, healthCareValability);
        this.maxAltitude = maxAltitude;
        this.chirps = chirps;
        this.fly = fly;
        this.wingsColor = wingsColor;
    }

}
