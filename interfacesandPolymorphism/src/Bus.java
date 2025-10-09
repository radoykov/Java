public class Bus extends Vehicle{
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
