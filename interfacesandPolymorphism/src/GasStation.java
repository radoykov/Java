public class GasStation {
    private int liters;

    GasStation(int liters){
        this.liters = liters;
    }

    public void refuelVehicle(Refuelable vehicle, int liters){//ref vehicle see only fuel (encapsulation)
        if (liters <= this.liters) {
            vehicle.refuel(liters);
            this.liters -= liters;
            System.out.println("Refueled with " + liters + " liters. Remaining: " + this.liters);
        } else {
            System.out.println("Not enough fuel available.");
        }
    }
}