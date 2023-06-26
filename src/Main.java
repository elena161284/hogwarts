public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", "Gryffindor",100, 80, 50, 90, 70),
                new Gryffindor("Гермиона Грейнджер", "Gryffindor",90, 50, 50, 90, 50),
                new Gryffindor("Рон Уизли", "Gryffindor",70, 40, 60, 90, 60)
        };
        Kogtevpan[] kogtevpans = {
                new Kogtevpan("Чжоу Чанг", "Kogtevpan",60, 40, 30, 20, 50, 80),
                new Kogtevpan("Падма Патил", "Kogtevpan",70, 50, 20, 60, 40, 10),
                new Kogtevpan("Маркус Белби", "Kogtevpan",50, 20, 50, 70, 40, 20)
        };
        Puffendui[] puffenduis = {
                new Puffendui("Захария Смит ", "Puffendui",50, 20, 50, 40, 30),
                new Puffendui("Седрик Диггори", "Puffendui",70, 50, 20, 60, 40),
                new Puffendui("Джастин Финч-Флетчли", "Puffendui", 50, 20, 50, 70, 40)
        };
        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", "Slizerin",40, 10, 50, 60, 20,
                        10, 10),
                new Slizerin("Грэхэм Монтегю", "Slizerin",70, 50, 20, 50, 70,
                        30, 88),
                new Slizerin("Грегори Гойл", "Slizerin",50, 20, 50, 70, 40,
                        50, 25)
        };

        gryffindors[0].compare(slizerins[2]);
        gryffindors[0].compare(gryffindors[1]);
        kogtevpans[2].compare(kogtevpans[1]);
        puffenduis[1].compare(puffenduis[0]);
        slizerins[0].compare(slizerins[2]);
    }
}