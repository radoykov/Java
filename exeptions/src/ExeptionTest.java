public class ExeptionTest {
    public void throwRuntimeExeption(){
        throw new RuntimeException("Some");
    }
    public void ThrowMyExeption(){
        try{
            int a = 10/0;
        }catch (ArithmeticException arex){
            throw new MyExeption("My exept.", arex);
        }
    }
}