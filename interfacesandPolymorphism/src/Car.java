public class Car extends Vehicle implements Refuelable{
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