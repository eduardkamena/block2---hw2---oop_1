import java.util.Objects;

// Класс-наследник Слизерин
public class Slytherin extends Hogwarts {
    private final int cunning; // Хитрость
    private final int determination; // Решительность
    private final int ambition; // Амбициозность
    private final int resourcefulness; // Находчивость
    private final int lustForPower; // Жажда власти

    // Конструктор с использованием родительских свойств
    public Slytherin(String fullName, int witchcraftPower, int transgressionLength,
                     int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, witchcraftPower, transgressionLength);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    // Переопределенный метод (геттер)
    @Override
    public int getSum() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    // Equals, hashCode & toString (с родительским super)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && lustForPower == slytherin.lustForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, lustForPower);
    }

    @Override
    public String toString() {
        return "Слизерин: " + super.toString() +
                ", хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + lustForPower;
    }

    // Метод, который сравнивает между собой двух учеников факультета Слизерин по свойствам
    public static void compareStudent(Slytherin first, Slytherin second) {
        if (first.getSum() > second.getSum()) {
            System.out.println(first.getFullName() + " лучший Слизеринец, чем " + second.getFullName());
        } else if (first.getSum() < second.getSum()) {
            System.out.println(second.getFullName() + " лучший Слизеринец, чем " + first.getFullName());
        } else {
            System.out.println(first.getFullName() + " и " + second.getFullName() + " оба хорошие Слизериновцы");
        }
    }

}
