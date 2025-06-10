import java.lang.String;
public abstract class Vehicle {
    private double fuelVolume;
    private int enginePower;
    private String fuelType;

    public Vehicle(double fuelVolume, int enginePower, String fuelType) {
        this.fuelVolume = fuelVolume;
        this.enginePower = enginePower;
        this.fuelType = fuelType;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Объем топливного бака: " + fuelVolume + '\n' +
                "Мощность двигателя: " + enginePower + '\n' +
                "Тип топлива: " + fuelType;
    }
}

