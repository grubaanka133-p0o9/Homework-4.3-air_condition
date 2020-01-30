public class Decrease {

    void decrease(Room room) {
        if (room.temperatureDecreases(room)) {
            System.out.println("The temperature after reduction is : " + room.getTemperature());
        } else {
            System.out.println("The room has no air conditioning or excees the imit.");
        }
    }
}

