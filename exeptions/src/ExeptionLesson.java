public class ExeptionLesson {
    void main() {
//        ExeptionTest ex = new ExeptionTest();
//        try {
//            ex.throwRuntimeExeption();
//        }catch (RuntimeException e){
//            System.out.println(e);
//        }

//        ex.ThrowMyExeption();

        Number num = new Number();
//        num.increase(1);
        try{
            num.decrease(5);
        } catch (NumberExeption numEX) {
            numEX.printStackTrace();
        }

        System.out.println("This is the end of the program!");

    }
}

