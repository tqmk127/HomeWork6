import java.util.Objects;

public class Rocket extends Machine {

    private double weight;
    private int amountOfPassengers;
    private int movement;

    public Rocket(String name, double speed, double weight, int amountOfPassengers, int movement) {
        super(name, speed);//виклик конструктора суперкласу з передачею параметрів
        this.weight = weight;
        this.amountOfPassengers = amountOfPassengers;
        this.movement = movement;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "weight=" + weight +
                ", amountOfPassengers=" + amountOfPassengers +
                ", movement=" + movement + ", " ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rocket rocket = (Rocket) o;
        return Double.compare(rocket.weight, weight) == 0 &&
                amountOfPassengers == rocket.amountOfPassengers &&
                movement == rocket.movement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, amountOfPassengers, movement);
    }

    //перевизначені методи
    @Override
    double getMinSpeed() {
        return super.MinSpeed;
    }

    @Override
    double getMaxSpeed() {
        return super.MaxSpeed;
    }

    @Override
    String getName() {
        return super.name;
    }

    @Override
    public double getSpeed() {
        return super.speed;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    @Override
    public int getMovement() {
        return movement;
    }

    @Override//перевизначення метода
    public void printInfo() {
        super.printInfo();//виклик метода суперкласу
        System.out.println("Вага: " + getWeight() + " тонн\nК-сть сопел: " + getMovement()
                + "\nК-сть пасажирів: " + getAmountOfPassengers());
    }
}
