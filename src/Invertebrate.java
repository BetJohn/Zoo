public class Invertebrate extends Animal{
    private boolean fly;
    private String foodType;

    public Invertebrate(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, boolean fly, String foodType) {
        super(name, age, breed, needFoodOrWater, healthCareValability);
        this.fly = fly;
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return super.toString() + "Invertebrate{" +
                "fly=" + fly +
                ", foodType='" + foodType + '\'' +
                '}';
    }

    public Invertebrate(boolean fly, String foodType) {
        this.fly = fly;
        this.foodType = foodType;
    }

    public boolean canFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
