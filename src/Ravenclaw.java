import java.util.Objects;

// Класс-наследник Когтевран
public class Ravenclaw extends Hogwarts {
    private final int intelligence; // Ум
    private final int wisdom; // Мудрость
    private final int wit; // Остроумие
    private final int creativity; // Творчество

    // Конструктор с использованием родительских свойств
    public Ravenclaw(String fullName, int witchcraftPower, int transgressionLength,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(fullName, witchcraftPower, transgressionLength);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    // Переопределенный метод (геттер)
    @Override
    public int getSum() {
        return intelligence + wisdom + wit + creativity;
    }

    // Equals, hashCode & toString (с родительским super)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return intelligence == ravenclaw.intelligence && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), intelligence, wisdom, wit, creativity);
    }

    @Override
    public String toString() {
        return "Когтевран: " + super.toString() +
                ", ум = " + intelligence +
                ", мудрость = " + wisdom +
                ", остроумие = " + wit +
                ", творчество = " + creativity;
    }

    // Метод, который сравнивает между собой двух учеников факультета Когтевран по свойствам
    public static void compareStudent(Ravenclaw first, Ravenclaw second) {
        if (first.getSum() > second.getSum()) {
            System.out.println(first.getFullName() + " лучший Когтевранец, чем " + second.getFullName());
        } else if (first.getSum() < second.getSum()) {
            System.out.println(second.getFullName() + " лучший Когтевранец, чем " + first.getFullName());
        } else {
            System.out.println(first.getFullName() + " и " + second.getFullName() + " оба хорошие Когтевранцы");
        }
    }

}
