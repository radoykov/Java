void main() {
    Pair<String, Integer> pair = new Pair<>("Age", 7);
    System.out.println(pair.getFirst());
    System.out.println(pair.getSecond());
    System.out.println("-----");

    String[] arr = {"1", "2", "3", "4"};
    System.out.println(Calc.findIndex(arr, "3"));
    System.out.println("-----");

    Car[] cars = new Car[3];

    cars[0] = new Car("Toyota Corolla", 2020);
    cars[1] = new Car("Honda Civic", 2021);
    cars[2] = new Car("Ford Mustang", 2022);
    System.out.println(Calc.findIndex(cars, cars[2]));


}