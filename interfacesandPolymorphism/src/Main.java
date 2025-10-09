void main() {
    Car car = new Car(455, "mustang", 10, "V8", "GTS");
    car.displayOn();
//    car.printInfo();

    GasStation station = new GasStation(113);
    Car myCar = new Car(120, "opel", 20, "V4", "GTS");

    System.out.println("");
    station.refuelVehicle(myCar, 30);
    myCar.displayOn();

    System.out.println("");
    Bus bus = new Bus(100, "mercedes", 30, 35);
    station.refuelVehicle(bus, 70);
    bus.displayOn();

    System.out.println("");
    Truck truck = new Truck(230, "Ford", 60, "meat");
    station.refuelVehicle(truck, 2);
    truck.displayOn();
}