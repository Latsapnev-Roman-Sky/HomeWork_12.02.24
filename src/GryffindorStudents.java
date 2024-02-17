public class GryffindorStudents extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudents (String name, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int sumBallsGryffindor() {
        int sum = 0;
        sum += getNobility()+getHonor()+getBravery();
        return sum;
    }

    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    @Override
    public String toString() {
        return super.toString()+", Благородство - "+nobility+", Честь - "+honor+", Храбрость - "+bravery;
    }

}
