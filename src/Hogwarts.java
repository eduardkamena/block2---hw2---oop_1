import java.util.Objects;

// Абстрактный класс Хогвартс
public abstract class Hogwarts {
    private final String fullName; // Полное имя
    private final int witchcraftPower; // Мощность колдовства
    private final int transgressionLength; // Расстояние трансгрессии

    // Конструктор
    public Hogwarts(String fullName, int witchcraftPower, int transgressionLength) {
        this.fullName = fullName;
        this.witchcraftPower = witchcraftPower;
        this.transgressionLength = transgressionLength;
    }

    // Геттеры
    public String getFullName() {
        return fullName;
    }

    public int getWitchcraftPower() {
        return witchcraftPower;
    }

    public int getTransgressionLength() {
        return transgressionLength;
    }

    // Абстрактный метод для переопределения
    public abstract int getSum();

    // Equals, hashCode & toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return witchcraftPower == hogwarts.witchcraftPower && transgressionLength == hogwarts.transgressionLength && Objects.equals(fullName, hogwarts.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, witchcraftPower, transgressionLength);
    }

    @Override
    public String toString() {
        return "Ученик = " + fullName +
                ", мощность колдовства = " + witchcraftPower +
                ", расстояние трансгрессии = " + transgressionLength;
    }

    // Метод, который выводит на экран описание студента: качества, присущие всем ученикам школы и присущие определенному факультету
    public static void printStudent(Hogwarts student) {
        System.out.println(student);
    }

    // Метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии
    public static void comparePower(Hogwarts first, Hogwarts second) {
        int firstSum = first.getTransgressionLength() + first.getWitchcraftPower();
        int secondSum = second.getTransgressionLength() + second.getWitchcraftPower();
        if (firstSum > secondSum) {
            System.out.println(first.getFullName() + " обладает бОльшей мощностью магии, чем " + second.getFullName());
        } else if (firstSum < secondSum) {
            System.out.println(second.getFullName() + " обладает бОльшей мощностью магии, чем " + first.getFullName());
        } else {
            System.out.println(first.getFullName() + " и " + second.getFullName() + " обладают одинаковой мощностью магии");
        }
    }

}
