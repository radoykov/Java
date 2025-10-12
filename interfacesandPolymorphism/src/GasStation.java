public class GasStation {
    private double fuelAvailable;
    private String name;
    private String location;

    GasStation(double liters, String name, String location) {
        this.fuelAvailable = liters;
        this.name = name;
        this.location = location;
    }

    public void refuelVehicle(Refuelable vehicle, double liters) {
        if (liters > this.fuelAvailable) {
            System.out.println("Not enough fuel available.");
            return;
        }
        boolean result = vehicle.addFuel(liters);
        if (!result) {
            System.out.println("Not enough free tank capacity!");
            return;
        }
        this.fuelAvailable -= liters;
        System.out.println("Refueled with " + liters + " liters. Remaining: " + this.fuelAvailable);
    }

    public void displayInfo() {
        System.out.println("Fuel available : " + fuelAvailable + " Name : " + name + " Location : " + location);
    }
}

/* public class GasStation {
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

 */