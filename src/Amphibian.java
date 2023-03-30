public class Amphibian extends Animal{
    private String skinType;
    private String skinColor;

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public Amphibian(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability, String skinType, String skinColor) {
        super(name, age, breed, needFoodOrWater, healthCareValability);
        this.skinType = skinType;
        this.skinColor = skinColor;
    }


    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }


    @Override
    public String toString() {
        return super.toString() + "Amphibian{" +
                "skinType='" + skinType + '\'' +
                ", skinColor='" + skinColor + '\'' +
                '}';
    }
}
