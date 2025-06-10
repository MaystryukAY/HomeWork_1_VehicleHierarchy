public class Truck extends Vehicle implements HasWheels, HasCargo{
    private double loadCapacity;
    public Truck(double fuelVolume, int enginePower, String fuelType, double loadCapacity) {
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
        System.out.println("На грузовиках перевозят разные товары по всей стране...");
    }

    @Override
    public void describeWheels() {
        System.out.println("У грузовиков от 4х колес" + '\n');
    }

    @Override
    public String toString() {
        return "Это грузовик! " + '\n' + "Вот немного данных о нем: " + '\n' + super.toString() + '\n' + "Грузоподъемность: " + loadCapacity;
    }
}
