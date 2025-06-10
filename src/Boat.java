public class Boat extends Vehicle implements HasScrew, HasCargo{
    private double loadCapacity;
    public Boat(double fuelVolume, int enginePower, String fuelType, double loadCapacity) {
        super(fuelVolume, enginePower, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void describeCargo() {
        System.out.println("На лодке перевозят груз по воде...");
    }

    @Override
    public void describeScrew() {
        System.out.println("У лодки есть винт!" + '\n');
    }

    @Override
    public String toString() {
        return "Это лодка! " + '\n' + "Вот немного данных о ней: " + '\n' + super.toString() + '\n' + "Грузоподъемность: " + loadCapacity;
    }
}
