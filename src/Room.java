public class Room {
    double size;
    double temperature;
    boolean airConditionin;
    double minimalTemp;

    public Room(double size, double temperature, boolean airConditionin) {
        this.size = size;
        this.temperature = temperature;
        this.airConditionin = airConditionin;
    }

    public Room(double size, double temperature, boolean airConditionin, double minimalTemp) {
        this.size = size;
        this.temperature = temperature;
        this.airConditionin = airConditionin;
        this.minimalTemp = minimalTemp;


    }

    public boolean droppingTemp() {
        if (airConditionin && temperature > minimalTemp) {
            temperature--;
            return airConditionin;
        } else {
            return airConditionin;
        }
    }

    public void showInfo() {
        System.out.println("Room size: " + size + " m2" + " ,Temperature: " + temperature + " C " + " Have air Condition : " + airConditionin);
    }
}

