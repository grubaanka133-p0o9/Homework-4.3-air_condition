public class Test {
    public static void main(String[] args) {
        Decrease decrease = new Decrease();
        Room room1 = new Room(26,19, 17, true);
        Room room2 = new Room(32,24, 17, false);
        System.out.println("Room 1 :");
        decrease.decrease(room1);
        decrease.decrease(room1);
        decrease.decrease(room1);
        decrease.decrease(room1);
        System.out.println("\nRoom 2 :");
        decrease.decrease(room2);
    }
}
