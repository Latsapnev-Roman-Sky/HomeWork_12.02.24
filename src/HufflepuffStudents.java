public class HufflepuffStudents extends HogwartsStudents{
    private int industry;
    private int loyalty;
    private int honesty;

    public int sumBallsHufflepuff() {
        int sum = 0;
        sum += getIndustry()+getLoyalty()+getHonesty();
        return sum;
    }
    public HufflepuffStudents(String name, int magicPower, int transgression, int industry, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        this.industry = industry;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getIndustry() {
        return industry;
    }
    public void setIndustry(int industry) {
        this.industry = industry;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    public int getHonesty() {
        return honesty;
    }
    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString()+", Трудолюбие - "+industry+", Верность - "+loyalty+", Честность - "+honesty;
    }

}
