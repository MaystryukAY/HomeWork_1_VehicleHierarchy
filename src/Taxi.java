public class Taxi extends Vehicle implements HasWheels{
    private int loadCapacity;
    public Taxi(double fuelVolume, int enginePower, String fuelType, int loadCapacity) {
        super(fuelVolume, enginePower, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void describeWheels() {
        System.out.println("У такси как правило 4 колеса!" + '\n');
    }

    @Override
    public String toString() {
        return "Это такси! " + '\n' + "Вот немного данных о нем: " + '\n' + super.toString() + '\n' + "Грузоподъемность: " + loadCapacity;
    }
}
