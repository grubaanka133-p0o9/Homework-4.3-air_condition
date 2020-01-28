public class Room {
    double measurement;
    double temperature;
    double temperatureLimit;
    boolean airConditioner;


    public Room(double measurement, double temperature, double temperatureLimit, boolean airConditioner) {
        this.measurement = measurement;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
        this.temperatureLimit = temperatureLimit;
    }
    boolean temperatureDecreases(Room room){
        if((room.airConditioner) && (room.temperature > room.temperatureLimit)){
            room.temperature -= 1;
            return true;
        }
        return false;
    }
}
