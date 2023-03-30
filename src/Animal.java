public class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    private String breed;
    private boolean needFoodOrWater;
    private int healthCareValability;

    public String getName() {
        return name;
    }

    public Animal(String name, int age, String breed, boolean needFoodOrWater, int healthCareValability) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.needFoodOrWater = needFoodOrWater;
        this.healthCareValability = healthCareValability;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", needFoodOrWater=" + needFoodOrWater +
                ", healthCareValability=" + healthCareValability +
                '}';
    }

    public boolean isNeedFoodOrWater() {
        return needFoodOrWater;
    }

    public void setNeedFoodOrWater(boolean needFoodOrWater) {
        this.needFoodOrWater = needFoodOrWater;
    }

    @Override
    public int compareTo(Animal o) {
        return this.age - o.age;
    }

    public int getHealthCareValability() {
        return healthCareValability;
    }

    public void setHealthCareValability(int healthCareValability) {
        this.healthCareValability += healthCareValability;
    }
}
