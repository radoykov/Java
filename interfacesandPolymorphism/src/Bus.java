public class Bus extends Vehicle implements Refuelable {
    private int passengersCount;

    public Bus(String model, double currentFuelLevel, double fuelTankCapacity, int passengersCount) {
        super(model, currentFuelLevel, fuelTankCapacity);
        setPassengersCount(passengersCount);
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        if (passengersCount > 0) {
            this.passengersCount = passengersCount;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Passengers count : " + passengersCount);
    }

}


/* public class Bus extends Vehicle{
    private int seats;

    Bus(int horsepower, String brand, int fuel, int seats){
        super(horsepower, brand, fuel);
        setSeats(seats);
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void displayOn() {
        super.displayOn();
        System.out.println("seats : " + seats);
    }
}
*/