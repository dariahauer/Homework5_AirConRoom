public class Room {
    double size;
    double temperature;
    boolean airConditionin;
    private double minimalTemp = 18;


    public Room(double size, double temperature, boolean airConditionin) {
        this.size = size;
        this.temperature = temperature;
        this.airConditionin = airConditionin;
    }


    public boolean droppingTemp() {
        if (airConditionin && temperature > minimalTemp) {
            temperature--;
            System.out.println("Changed temperature: " + temperature);
            return true;
        } else
            System.out.println("Temperature is not changed");
        return false;

    }

    public void showInfo() {
        System.out.println("Room size: " + size + " m2" + " ,Temperature: " + temperature + " C " + " Have air Condition : " + airConditionin);
    }
}

