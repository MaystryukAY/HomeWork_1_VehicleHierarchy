public class Aircraft extends Vehicle implements HasWheels, HasScrew, HasWings, HasCargo{
    private double loadCapacity;

    public Aircraft(double fuelVolume, int enginePower, String fuelType, double loadCapacity) {
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
        return "Это самолет! " + '\n' + "Вот немного данных о нем: " + '\n' + super.toString() + '\n' + "Грузоподъемность: " + loadCapacity;
    }

    @Override
    public void describeWheels() {
        System.out.println("У самолета есть шасси!");
    }

    @Override
    public void describeScrew() {
        System.out.println("На кукурузнике есть винт!");
    }

    @Override
    public void describeWings() {
        System.out.println("У самолета есть 2 крыла!");
    }

    @Override
    public void describeCargo() {
        System.out.println("На самолете можно перемещать грузы на дальние расстония за кратчайшее время." + '\n');
    }
}
