public class Mamal  extends  Animal{
    private boolean comunicateBySounds;
    private int inteligence;
    private String feedingType;
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

    public String getFeedingType() {
        return feedingType;
    }

    public void setFeedingType(String feedingType) {
        this.feedingType = feedingType;
    }

    public boolean hasHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    public Mamal(String name, int age, String breed, boolean comunicateBySounds, int inteligence, String feedingType, boolean hair) {
        super(name, age, breed);
        this.comunicateBySounds = comunicateBySounds;
        this.inteligence = inteligence;
        this.feedingType = feedingType;
        this.hair = hair;
    }

    public Mamal(boolean comunicateBySounds, int inteligence, String feedingType, boolean hair) {
        this.comunicateBySounds = comunicateBySounds;
        this.inteligence = inteligence;
        this.feedingType = feedingType;
        this.hair = hair;
    }
}
