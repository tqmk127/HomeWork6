import java.util.Objects;

public class Satellite extends Rocket {

    private String date;//дата вильоту

    public Satellite(String name, double speed, double weight, int amountOfPassengers, int movement, String date) {
        super(name, speed, weight, amountOfPassengers, movement);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "date='" + date + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Satellite satellite = (Satellite) o;
        return Objects.equals(date, satellite.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), date);
    }

    @Override//перевизначення метода
    public void printInfo() {
        super.printInfo();//виклик метода суперкласу
        System.out.println("Дата вильоту: " + getDate());
    }
}
