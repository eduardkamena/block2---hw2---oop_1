import java.util.Objects;

// Класс-наследник Пуффендуй
public class Hufflepuff extends Hogwarts {
    private final int diligence; // Трудолюбие
    private final int loyalty; // Верность
    private final int honor; // Честность

    // Конструктор с использованием родительских свойств
    public Hufflepuff(String fullName, int witchcraftPower, int transgressionLength,
                      int diligence, int loyalty, int honor) {
        super(fullName, witchcraftPower, transgressionLength);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    // Переопределенный метод (геттер)
    @Override
    public int getSum() {
        return diligence + loyalty + honor;
    }

    // Equals, hashCode & toString (с родительским super)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return diligence == that.diligence && loyalty == that.loyalty && honor == that.honor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diligence, loyalty, honor);
    }

    @Override
    public String toString() {
        return "Пуффендуй: " + super.toString() +
                ", трудолюбие = " + diligence +
                ", верность = " + loyalty +
                ", честность = " + honor;
    }

    // Метод, который сравнивает между собой двух учеников факультета Пуффендуй по свойствам
    public static void compareStudent(Hufflepuff first, Hufflepuff second) {
        if (first.getSum() > second.getSum()) {
            System.out.println(first.getFullName() + " лучший Пуффендуивец, чем " + second.getFullName());
        } else if (first.getSum() < second.getSum()) {
            System.out.println(second.getFullName() + " лучший Пуффендуивец, чем " + first.getFullName());
        } else {
            System.out.println(first.getFullName() + " и " + second.getFullName() + " оба хорошие Пуффендуивцы");
        }
    }

}
