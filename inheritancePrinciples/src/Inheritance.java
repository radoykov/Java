public class Inheritance extends Sample {
    Inheritance() {
        System.out.println(super.a);
    }

    @Override //checks if the name is the same as the name of overridden method
    public void getInfo() {
        super.getInfo();
        System.out.print(" " + super.d + " " + "printed"+ "\n");
    }
}
