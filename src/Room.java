public class Room {
    double size;
    double temperature;
    boolean airConditionin;

    public Room(double size, double temperature, boolean airConditionin) {
        this.size = size;
        this.temperature = temperature;
        this.airConditionin = airConditionin;
    }

    public boolean lowTemp() {
        if (airConditionin == true && temperature > 18) {
            temperature--;
            return airConditionin;
        } else {
            return airConditionin;
        }
    }
}

