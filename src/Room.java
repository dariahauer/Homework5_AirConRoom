public class Room {
    double size;
    double temperature;
    boolean airConditionin;
    private double minimalTemp;

    public Room(double size, double temperature, boolean airConditionin) {
        this.size = size;
        this.temperature = temperature;
        this.airConditionin = airConditionin;
    }

    public Room(double size, double temperature, boolean airConditionin, double minimalTemp) {
        this(size, temperature, airConditionin);
        this.minimalTemp = minimalTemp;

    }

    public boolean droppingTemp() {
        double minimalTemp=18;
        if (airConditionin && temperature > minimalTemp) {
            temperature--;
            return true;
        } else
            return false;

    }

    public void showInfo() {
        System.out.println("Room size: " + size + " m2" + " ,Temperature: " + temperature + " C " + " Have air Condition : " + airConditionin);
    }
}

