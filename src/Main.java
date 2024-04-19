public class Main {
    public static void main(String[] args) {

        // Реализация учеников в качестве объектов:
        // Гриффиндор
        Gryffindor harry = new Gryffindor("Гарри Поттер", 60, 30, 80, 50, 95);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 99, 85, 70, 66, 85);
        Gryffindor ron = new Gryffindor("Рон Уизли", 50, 45, 70, 87, 84);

        // Слизерин
        Slytherin drako = new Slytherin("Драко Малфой", 55, 40, 50, 30, 30, 50, 80);
        Slytherin grehem = new Slytherin("Грэхэм Монтегю", 26, 45, 31, 84, 65, 44, 85);
        Slytherin gregory = new Slytherin("Грегори Гойл", 64, 23, 86, 46, 24, 46, 86);

        // Пуффендуй
        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 34, 86, 24, 74, 87);
        Hufflepuff sedric = new Hufflepuff("Седрик Диггори", 75, 87, 97, 76, 98);
        Hufflepuff jastin = new Hufflepuff("Джастин Финч-Флетчли", 42, 75, 24, 64, 45);

        // Когтевран
        Ravenclaw chzou = new Ravenclaw("Чжоу Чанг", 35, 45, 76, 34, 35, 37);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 43, 75, 45, 35, 46, 56);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 53, 43, 56, 35, 75, 68);

        // Вызов метода, который выводит на экран описание студента:
        // качества, присущие всем ученикам школы и присущие определенному факультету
        Hogwarts.printStudent(drako);
        System.out.println();

        // Вызов метода, который сравнивает между собой двух учеников факультета Гриффиндор по свойствам
        Gryffindor.compareStudent(harry, germiona);
        System.out.println();

        // Вызов метода, который сравнивает между собой двух учеников факультета Слизерин по свойствам
        Slytherin.compareStudent(grehem, drako);
        System.out.println();

        // Вызов метода, который сравнивает между собой двух учеников факультета Пуффендуй по свойствам
        Hufflepuff.compareStudent(zaharia, sedric);
        System.out.println();

        // Вызов метода, который сравнивает между собой двух учеников факультета Когтевран по свойствам
        Ravenclaw.compareStudent(padma, chzou);
        System.out.println();

        // Вызов метода, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии
        Hogwarts.comparePower(jastin, marcus);
        System.out.println();

    }

}
