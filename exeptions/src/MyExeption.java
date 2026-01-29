public class MyExeption extends RuntimeException{
    MyExeption(String msg, Throwable cause){
        super(msg, cause);
    }
}