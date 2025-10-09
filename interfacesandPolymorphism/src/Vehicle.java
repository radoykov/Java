public abstract class Vehicle implements Refuelable {
    private int horsepower;
    private String brand;
    private int fuel;

    public Vehicle(int horsepower, String brand, int fuel){
        setHorsepower(horsepower);
        setBrand(brand);
        setFuel(fuel);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuel() {
        return fuel;
    }

    public void displayOn(){
        System.out.println( "hp : " +  horsepower + " brand : " + brand + " fuel : " + fuel);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

//    abstract void  printInfo();

    @Override
    public void refuel(int liters){
        this.fuel += liters;
    }
}
