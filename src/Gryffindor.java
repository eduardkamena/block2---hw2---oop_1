import java.util.Objects;

// Класс-наследник Гриффиндор
public class Gryffindor extends Hogwarts {
    private final int nobility; // Благородство
    private final int honor; // Честь
    private final int bravery; // Храбрость

    // Конструктор с использованием родительских свойств
    public Gryffindor(String fullName, int witchcraftPower, int transgressionLength,
                      int nobility, int honor, int bravery) {
        super(fullName, witchcraftPower, transgressionLength);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    // Переопределенный метод (геттер)
    @Override
    public int getSum() {
        return nobility + honor + bravery;
    }

    // Equals, hashCode & toString (с родительским super)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return "Гриффиндор: " + super.toString() +
                ", благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }

    // Метод, который сравнивает между собой двух учеников факультета Гриффиндор по свойствам
    public static void compareStudent(Gryffindor first, Gryffindor second) {
        if (first.getSum() > second.getSum()) {
            System.out.println(first.getFullName() + " лучший Гриффиндорец, чем " + second.getFullName());
        } else if (first.getSum() < second.getSum()) {
            System.out.println(second.getFullName() + " лучший Гриффиндорец, чем " + first.getFullName());
        } else {
            System.out.println(first.getFullName() + " и " + second.getFullName() + " оба хорошие Гриффиндоровцы");
        }
    }

}
