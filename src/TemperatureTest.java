public class TemperatureTest {
    public static void main(String[] args) {

        Room room = new Room(35, 20, true);
        room.droppingTemp(18);
        room.showInfo();

        room.droppingTemp(18);
        room.showInfo();
        room.droppingTemp(18);
        room.showInfo();

        Room room1 = new Room(40, 30, false);
        room1.droppingTemp(18);
        room1.showInfo();
        room1.droppingTemp(0);
        room1.showInfo();

        Room room2 = new Room(20, 10, true);
        room2.droppingTemp(18);
        room2.showInfo();

    }
}
