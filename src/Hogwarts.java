public class Hogwarts {
    public void printStudent(HogwartsStudents student) {
        System.out.println(student);
    }
    public  void compareStudents (HogwartsStudents first, HogwartsStudents second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println("У студента - "+first.getName()+" магия сильнее чем у студента - "+second.getName());
        } else if (first.getMagicPower() == second.getMagicPower()) {
            System.out.println("Студенты "+first.getName()+" и "+second.getName()+" равны по силе");
        } else {
            System.out.println("У студента - "+second.getName()+" магия сильнее чем у студента - "+first.getName());
        }

        if (first.getTransgression() > second.getTransgression()) {
            System.out.println("У студента - "+first.getName()+" трансгрессия магии дальше чем у студента - "+second.getName());
        } else if (first.getMagicPower() == second.getMagicPower()) {
            System.out.println("Студенты "+first.getName()+" и "+second.getName()+" равны по трансгрессированию магии");
        } else {
            System.out.println("У студента - "+second.getName()+" трансгрессия магии дальше чем у студента - "+first.getName());
        }
    }
    public void compareGryffindorStudents(GryffindorStudents first, GryffindorStudents second) {
        if (first.sumBallsGryffindor() > second.sumBallsGryffindor()) {
            System.out.println("Гриффиндор: " + first.getName() + " набрал - " + first.sumBallsGryffindor() + " баллов, а " + second.getName() + " - " + second.sumBallsGryffindor());
            System.out.println(first.getName()+" лучший гриффиндорец!");
        } else if (first.sumBallsGryffindor() == second.sumBallsGryffindor()) {
            System.out.println("Гриффиндор: " + first.getName() + " и " + second.getName() + " набрали одинаковое количество баллов - " + first.sumBallsGryffindor() + " = " + second.sumBallsGryffindor());
            System.out.println(first.getName()+" и "+second.getName()+" равны!");
        } else {
            System.out.println("Гриффиндор: " + second.getName() + " набрал - " + second.sumBallsGryffindor() + " баллов, а " + first.getName() + " - " + first.sumBallsGryffindor());
            System.out.println(second.getName()+" лучший гриффиндорец!");
        }
    }
    public void compareHufflepuffStudents(HufflepuffStudents first, HufflepuffStudents second) {
        if (first.sumBallsHufflepuff() > second.sumBallsHufflepuff()) {
            System.out.println("Пуффендуй: " + first.getName() + " набрал - " + first.sumBallsHufflepuff() + " баллов, а " + second.getName() + " - " + second.sumBallsHufflepuff());
            System.out.println(first.getName()+"  лучший студент пуффендуя чем"+second.getName());
        } else if (first.sumBallsHufflepuff() == second.sumBallsHufflepuff()) {
            System.out.println("Пуффендуй: " + first.getName() + " и " + second.getName() + " набрали одинаковое количество баллов - " + first.sumBallsHufflepuff() + " = " + second.sumBallsHufflepuff());
            System.out.println(first.getName()+" и "+second.getName()+" равны!");
        } else {
            System.out.println("Пуффендуй: " + second.getName() + " набрал - " + second.sumBallsHufflepuff() + " баллов, а " + first.getName() + " - " + first.sumBallsHufflepuff());
            System.out.println(second.getName()+" лучший студент пуффендуя чем " +first.getName());
        }
    }
    public void compareRavenClawStudents(RavenClawStudents first, RavenClawStudents second) {
        if (first.sumBallsRavenClaw() > second.sumBallsRavenClaw()) {
            System.out.println("Когтевран: " + first.getName() + " набрал - " + first.sumBallsRavenClaw() + " баллов, а " + second.getName() + " - " + second.sumBallsRavenClaw());
            System.out.println(first.getName()+" лучший студент когтеврана чем "+second.getName());
        } else if (first.sumBallsRavenClaw() == second.sumBallsRavenClaw()) {
            System.out.println("Когтевран: " + first.getName() + " и " + second.getName() + " набрали одинаковое количество баллов - " + first.sumBallsRavenClaw() + " = " + second.sumBallsRavenClaw());
            System.out.println(first.getName()+" и "+second.getName()+" равны!");
        } else {
            System.out.println("Когтевран: " + second.getName() + " набрал - " + second.sumBallsRavenClaw() + " баллов, а " + first.getName() + " - " + first.sumBallsRavenClaw());
            System.out.println(second.getName()+" лучший студент когтеврана чем " +first.getName());
        }
    }
    public void compareSlytherinStudents(SlytherinStudents first, SlytherinStudents second) {
        if (first.sumBallsSlytherin() > second.sumBallsSlytherin()) {
            System.out.println("Слизерин: " + first.getName() + " набрал - " + first.sumBallsSlytherin() + " баллов, а " + second.getName() + " - " + second.sumBallsSlytherin());
            System.out.println(first.getName()+" лучший студент слизерина чем "+second.getName());
        } else if (first.sumBallsSlytherin() == second.sumBallsSlytherin()) {
            System.out.println("Слизерин: " + first.getName() + " и " + second.getName() + " набрали одинаковое количество баллов - " + first.sumBallsSlytherin() + " = " + second.sumBallsSlytherin());
            System.out.println(first.getName()+" и "+second.getName()+" равны!");
        } else {
            System.out.println("Слизерин: " + second.getName() + " набрал - " + second.sumBallsSlytherin() + " баллов, а " + first.getName() + " - " + first.sumBallsSlytherin());
            System.out.println(second.getName()+" лучший студент слизерина чем " +first.getName());
        }
    }
}
