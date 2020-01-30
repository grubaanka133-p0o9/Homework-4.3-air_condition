public class Room {
    private double measurement;
    private double temperature;
    private double temperatureLimit;
    private boolean airConditioner;

    public Room() {
    }
    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setTemperatureLimit(double temperatureLimit) {
        this.temperatureLimit = temperatureLimit;
    }
    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }
    public double getMeasurement() {
        return measurement;
    }
    public double getTemperature() {
        return temperature;
    }
    public double getTemperatureLimit() {
        return temperatureLimit;
    }
    public boolean isAirConditioner() {
        return airConditioner;
    }

    boolean temperatureDecreases(Room room) {
        if ((this.airConditioner) && (this.temperature > this.temperatureLimit)) {
            this.temperature -= 1;
            return true;
        }
        return false;
    }
}

