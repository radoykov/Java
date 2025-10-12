public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String model, double currentFuelLevel, double fuelTankCapacity, int loadCapacity) {
        super(model, currentFuelLevel, fuelTankCapacity);
        setLoadCapacity(loadCapacity);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        if (loadCapacity > 0) {
            this.loadCapacity = loadCapacity;
        }
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("load capacity : " + loadCapacity);
    }
}
/* public class Truck extends Vehicle{
    private String cargo;

    Truck(int horsepower, String brand, int fuel, String cargo){
        super(horsepower, brand, fuel);
        setCargo(cargo);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public void displayOn() {
        super.displayOn();
        System.out.println("cargo : " + cargo);
    }
}
*/