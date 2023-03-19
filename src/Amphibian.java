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

    public Amphibian(String name, int age, String breed, String skinType, String skinColor, boolean jump) {
        super(name, age, breed);
        this.skinType = skinType;
        this.skinColor = skinColor;
        this.jump = jump;
    }

    public Amphibian(String skinType, String skinColor, boolean jump) {
        this.skinType = skinType;
        this.skinColor = skinColor;
        this.jump = jump;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public boolean canJump() {
        return jump;
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    private boolean jump;
}
