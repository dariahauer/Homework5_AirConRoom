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

//    public Room(double size, double temperature, boolean airConditionin, double minimalTemp) {
//        this(size, temperature, airConditionin);
//        this.minimalTemp = minimalTemp;

 //   }

    public boolean droppingTemp(double  minimalTemp) {
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

