public class RavenClawStudents extends HogwartsStudents{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public int sumBallsRavenClaw() {
        int sum = 0;
        sum += getMind()+getWisdom()+getWit()+getCreation();
        return sum;
    }

    public RavenClawStudents(String name, int magicPower, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, magicPower, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }
    public void setMind(int mind) {
        this.mind = mind;
    }
    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public int getWit() {
        return wit;
    }
    public void setWit(int wit) {
        this.wit = wit;
    }
    public int getCreation() {
        return creation;
    }
    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString()+", Ум - "+mind+", Трудолюбие - "+wisdom+", Верность - "+wit+", Честность - "+creation;
    }
}
