public class Tanker extends Vehicle implements HasScrew, HasCargo{
    private double loadCapacity;
    public Tanker(double fuelVolume, int enginePower, String fuelType, double loadCapacity) {
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
        System.out.println("На танкерах перевозят очень много топлива!");
    }

    @Override
    public void describeScrew() {
        System.out.println("У танкера много винтов!" + '\n');
    }

    @Override
    public String toString() {
        return "Это танкер! " + '\n' + "Вот немного данных о нем: " + '\n' + super.toString() + '\n' + "Грузоподъемность: " + loadCapacity;
    }
}
