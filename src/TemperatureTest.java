public class TemperatureTest {
    public static void main(String[] args) {
        Room room = new Room(35, 20, true);

        room.lowTemp();
        System.out.println("Room size: " + room.size + " m2" + " ,Temperature: " + room.temperature + " C " + " Have air Condition : " + room.airConditionin);
        room.lowTemp();
        System.out.println("Room size: " + room.size + " m2" + " ,Temperature: " + room.temperature + " C " + " Have air Condition : " + room.airConditionin);
        room.lowTemp();
        System.out.println("Room size: " + room.size + " m2" + " ,Temperature: " + room.temperature + " C " + " Have air Condition : " + room.airConditionin);

        Room room1 = new Room(40, 30, false);
        room1.lowTemp();
        System.out.println("Room size: " + room1.size + " m2" + " ,Temperature: " + room1.temperature + " C " + " Have air Condition : " + room1.airConditionin);
        room1.lowTemp();
        System.out.println("Room size: " + room1.size + " m2" + " ,Temperature: " + room1.temperature + " C " + " Have air Condition : " + room1.airConditionin);

        Room room2 = new Room(20, 10, true);
        room1.lowTemp();
        System.out.println("Room size: " + room2.size + " m2" + " ,Temperature: " + room2.temperature + " C " + " Have air Condition : " + room2.airConditionin);


    }
}
