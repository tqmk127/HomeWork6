import java.util.Objects;

public abstract class Machine implements Run {

    protected final double MinSpeed = 1.7; //(км/с)
    protected final double MaxSpeed = 10.5; //(км/с)
    protected String name;
    protected double speed;

    //конструктор з параметрами
    public Machine(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    //абстрактні методи, які не містять тіла
    abstract double getMinSpeed();
    abstract double getMaxSpeed();
    abstract String getName();

    @Override
    public String toString() {
        return   "MinSpeed=" + MinSpeed +
                ", MaxSpeed=" + MaxSpeed +
                ", name='" + name + '\'' +
                ", speed=" + speed+ ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return Double.compare(machine.MinSpeed, MinSpeed) == 0 &&
                Double.compare(machine.MaxSpeed, MaxSpeed) == 0 &&
                Double.compare(machine.speed, speed) == 0 &&
                Objects.equals(name, machine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MinSpeed, MaxSpeed, name, speed);
    }

    @Override//перевизначення метода
    public void printInfo()
    {
        System.out.println("Назва: "+getName()+"\nMin. швидкість: "+ getMinSpeed()+"км/с\nMax. швидкість: "
                + getMaxSpeed()+ "км/с\nШвидкість: "+ getSpeed()+"км/с");
    }
}

