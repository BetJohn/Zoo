import java.util.Map;

public class BestFriend {
    Map<Animal, Animal> relationship;

    public Map<Animal, Animal> getRelationship() {
        return relationship;
    }

    public BestFriend(Map<Animal, Animal> relationship) {
        this.relationship = relationship;
    }

    public void setRelationship(Map<Animal, Animal> relationship) {
        this.relationship = relationship;
    }
    public void addRelationship(Animal animal1, Animal animal2) {
        relationship.put(animal1, animal2);
    }
}
