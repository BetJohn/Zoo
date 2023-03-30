public class Mammal  extends  Animal{
    private boolean comunicateBySounds;
    private int inteligence;
    private String foodType;
    private boolean hair;

    public boolean hasComunicateBySounds() {
        return comunicateBySounds;
    }

    public void setComunicateBySounds(boolean comunicateBySounds) {
        this.comunicateBySounds = comunicateBySounds;
    }

    public int getInteligence() {
        return inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean hasHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    public Mammal(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean comunicateBySounds, int inteligence, String foodType, boolean hair) {
        super(name, age, breed, needFoodOrWater, healthCareValability);
        this.comunicateBySounds = comunicateBySounds;
        this.inteligence = inteligence;
        this.foodType = foodType;
        this.hair = hair;
    }

    @Override
    public String toString() {
        return super.toString() + "Mammal{" +
                "comunicateBySounds=" + comunicateBySounds +
                ", inteligence=" + inteligence +
                ", foodType='" + foodType + '\'' +
                ", hair=" + hair +
                '}';
    }
}
