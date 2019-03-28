import java.util.Objects;

public class Research extends Rocket {

    private int MinPassengers;
    private int MaxPassengers;


    public Research(String name, double speed, double weight, int amountOfPassengers,
                    int movement, int MinPassengers, int MaxPassengers) {

        super(name, speed, weight, amountOfPassengers, movement);

        this.MinPassengers = MinPassengers;
        this.MaxPassengers = MaxPassengers;
    }


    @Override
    public String toString() {
        return super.toString() +
                "MinPassengers=" + MinPassengers +
                ", MaxPassengers=" + MaxPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Research research = (Research) o;
        return MinPassengers == research.MinPassengers &&
                MaxPassengers == research.MaxPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MinPassengers, MaxPassengers);
    }

    public int getMinPassengers() {
        return MinPassengers;
    }

    public int getMaxPassengers() {
        return MaxPassengers;
    }

    @Override//перевизначення метода
    public void printInfo() {
        super.printInfo();//виклик метода суперкласу
        System.out.println("Max. к-сть пасажирів: " + getMinPassengers()
                + "\nMin. к-сть пасажирів: " + getMaxPassengers());
    }
}
