public class Main {
    public static void main(String[] args) {

        Hogwarts hogwarts = new Hogwarts();

        GryffindorStudents Harry = new GryffindorStudents("Гарри Поттер", 26, 20, 50, 60, 40);
        GryffindorStudents Hermione = new GryffindorStudents("Гермиона Грейнджер", 21, 25, 40, 50, 60);
        GryffindorStudents Ron = new GryffindorStudents("Рон Уизли", 20, 20, 20, 20, 20);

        HufflepuffStudents Zechariah = new HufflepuffStudents("Захария Смит", 20, 20, 40, 50, 60);
        HufflepuffStudents Cedric = new HufflepuffStudents("Седрик Диггори", 20, 20, 35, 45, 80);
        HufflepuffStudents Justin = new HufflepuffStudents("Джастин Финч-Флетчли", 20, 20, 20, 20, 20);

        RavenClawStudents Zhou = new RavenClawStudents("Чжоу Чанг", 20, 20, 50, 40, 90,20);
        RavenClawStudents Padma = new RavenClawStudents("Падма Патил", 20, 20, 25, 60, 70,20);
        RavenClawStudents Marcus = new RavenClawStudents("Маркус Белби", 20, 20, 20, 20, 20,20);

        SlytherinStudents Draco = new SlytherinStudents("Драко Малфой", 20, 20, 70, 70, 70,20,20);
        SlytherinStudents Graham = new SlytherinStudents("Грэхэм Монтегю", 20, 20, 80, 80, 50,20,20);
        SlytherinStudents Gregory = new SlytherinStudents("Грегори Гойл", 20, 20, 20, 20, 20,20,20);

        hogwarts.printStudent(Harry);
        System.out.println();
        hogwarts.compareStudents(Harry, Hermione);
        System.out.println();
        hogwarts.compareGryffindorStudents(Harry,Ron);
        System.out.println();
        hogwarts.compareHufflepuffStudents(Zechariah,Cedric);
        System.out.println();
        hogwarts.compareRavenClawStudents(Zhou, Padma);
        System.out.println();
        hogwarts.compareSlytherinStudents(Draco,Graham);

    }
}