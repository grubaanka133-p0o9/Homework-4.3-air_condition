public class Test {
    public static void main(String[] args) {
        Decrease decrease = new Decrease();
        Room room1 = new Room();
        Room room2 = new Room();

        room1.setMeasurement(34);
        room1.setTemperature(21);
        room1.setTemperatureLimit(17);
        room1.setAirConditioner(true);

        room2.setMeasurement(47);
        room2.setTemperature(24);
        room2.setTemperatureLimit(17);
        room2.setAirConditioner(false);


        System.out.println("Room 1 :");
        decrease.decrease(room1);
        decrease.decrease(room1);
        decrease.decrease(room1);
        decrease.decrease(room1);
        System.out.println("\nRoom 2 :");
        decrease.decrease(room2);

    }
}
