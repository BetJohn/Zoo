public class Reptile extends Animal{
    private boolean swim;
    private String color;
    private boolean poisonous;

    public Reptile(String name, int age, String breed, boolean swim, String color, boolean poisonous) {
        super(name, age, breed);
        this.swim = swim;
        this.color = color;
        this.poisonous = poisonous;
    }

    public Reptile(boolean swim, String color, boolean poisonous) {
        this.swim = swim;
        this.color = color;
        this.poisonous = poisonous;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }
}
