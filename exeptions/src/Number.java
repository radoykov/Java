public class Number {
    int a = 6;

    public void increase(int num){
        a += num;
        if(a > 6){
            throw new NumberExeption("Out of bounud > 6!");
        }
    }
    public void decrease(int num ){
        a -= num;
        if(a < 2){
            throw new NumberExeption("Out of bounud < 2!");
        }
    }
}
