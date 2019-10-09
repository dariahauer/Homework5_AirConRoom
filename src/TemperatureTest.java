public class TemperatureTest {
    public static void main(String[] args) {
        Room room = new Room(35, 20, true, 18);
        room.droppingTemp();
        room.showInfo();

        room.droppingTemp();
        room.showInfo();
        room.droppingTemp();
        room.showInfo();

        Room room1 = new Room(40, 30, false, 18);
        room1.droppingTemp();
        room1.showInfo();
        room1.droppingTemp();
        room1.showInfo();

        Room room2 = new Room(20, 10, true,18);
        room2.droppingTemp();
        room2.showInfo();

    }
}
