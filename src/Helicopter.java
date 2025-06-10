public class Helicopter extends Vehicle implements HasWheels, HasScrew, HasCargo{
    private double loadCapacity;
    public Helicopter(double fuelVolume, int enginePower, String fuelType, double loadCapacity) {
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
    public String toString() {
        return "Это вертолет! " + '\n' + "Вот немного данных о нем: " + '\n' + super.toString() + '\n' + "Грузоподъемность: " + loadCapacity;
    }

    @Override
    public void describeWheels() {
        System.out.println("У вертолета есть шасси!");
    }

    @Override
    public void describeScrew() {
        System.out.println("У вертолета есть лопости!");
    }

    @Override
    public void describeCargo() {
        System.out.println("На вертолете перевозят грузы в самые неудобные и труднодоступные места." + '\n');
    }
}
