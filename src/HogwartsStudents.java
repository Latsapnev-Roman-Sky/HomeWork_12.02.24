public class HogwartsStudents {
    private String name;
    private int magicPower;
    private int transgression;

    public HogwartsStudents (String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }
    public String getName() {
        return name;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
    public int getTransgression() {
        return transgression;
    }
    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    @Override
    public String toString() {
        return "Имя - "+name+", Сила магии - "+magicPower+", Трансгрессия - "+transgression;
    }
}
