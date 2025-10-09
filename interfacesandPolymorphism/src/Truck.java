public class Truck extends Vehicle{
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
