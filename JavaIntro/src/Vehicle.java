class Vehicle {
    private final int id;           //created in stack
    private static int counter = 0; //created in stack
    private String color;          //created in stack

    public Vehicle() {   //default constructor
        counter++;
        id = counter;
        color = "brown";
    }

    public Vehicle(String color) {
        this();
        setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void displayInfo() {
        System.out.println("Count : " + counter + " " + "ID : " + id + " " + "Colour : " + color);
    }
}