public class Car extends Vehicle {
    private int doorCount;

    public Car(String model, double currentFuelLevel , double fuelTankCapacity, int doorCount) {
        super(model, currentFuelLevel, fuelTankCapacity);
        setDoorCount(doorCount);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("DoorCount : " +  doorCount);
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        if (doorCount > 0) {
            this.doorCount = doorCount;
        }
    }
}

/* public class Car extends Vehicle implements Refuelable{
    private String engine;
    private String type;

    public Car(int horsepower, String brand, int fuel, String engine, String type){
        super(horsepower, brand, fuel);
        setEngine(engine);
        setType(type);
    }

    @Override
    public void displayOn() {
        super.displayOn();
        System.out.println("engine : " + engine + " type : " + type);
    }

    public String getEngine() {
        return engine;
    }

    public String getType() {
        return type;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setType(String type) {
        this.type = type;
    }

//    @Override
//    void printInfo() {
//        System.out.println("engine : " + engine + " type : " + type);
//    }
}
 */