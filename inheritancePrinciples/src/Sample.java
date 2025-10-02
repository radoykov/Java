public class Sample {
    //privilege levels
    public int a = 22;// all methods can access it
    private int b; // only accessible in the defined class
    protected int x = 10; //can be used only in defined class and in the inherited class
    public int c ;// default -> used in interfaces
    public final int d = 5;// constant

    public Sample() {
    }
    public void getInfo(){
        System.out.print(a);
    }
    //private Sample(){} // private constructors ensures that the instance of the class will be given when the class decides
    //getters and setters

    //method overloading
    public int sum(){
        return 0;
    }
    public int sum(int a, int b){
        return  a + b;
    }
}
