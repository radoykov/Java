public interface Refuelable {
    boolean addFuel(double liters); // adds fuel to the tank
    double getCurrentFuelLevel(); // returns current fuel level
    double getFuelTankCapacity(); // returns tack capacity
}

/* public interface Refuelable {
    public void refuel(int liters);
}
*/