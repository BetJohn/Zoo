public class Fish extends Animal{
    private boolean predator;
    private int length;
    private String waterType;
    private int maxDepth;

    public Fish(String name, int age, String breed, boolean predator, int length, String waterType, int maxDepth) {
        super(name, age, breed);
        this.predator = predator;
        this.length = length;
        this.waterType = waterType;
        this.maxDepth = maxDepth;
    }

    public Fish(boolean predator, int length, String waterType, int maxDepth) {
        this.predator = predator;
        this.length = length;
        this.waterType = waterType;
        this.maxDepth = maxDepth;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }
}
