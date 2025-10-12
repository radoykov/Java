void main() {
    /*
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

     */

    GasStation gasStation = new GasStation(5000, "Shell", "Sofia");
    gasStation.displayInfo();
    Car car = new Car("Toyota Corolla", 25, 50, 4);
    gasStation.refuelVehicle(car, 20);
    car.displayInfo();

    Truck truck = new Truck("Volvo FH", 80, 200, 5);
    gasStation.refuelVehicle(truck, 100);
    truck.displayInfo();

    //
    Bus bus = new Bus("Mercedes", 20, 90, 20);
    gasStation.refuelVehicle(bus, 15);
    bus.displayInfo();

    gasStation.refuelVehicle(bus, 1000);
    bus.displayInfo();
}