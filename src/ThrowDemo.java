public class ThrowDemo {

    static void demo(){
        try {
            NullPointerException exception = new NullPointerException("Ошибка!");
            throw exception;
        }
        catch (NullPointerException e){
            System.out.println("Перехват исключения в методе demo");
            throw e;
        }
    }
}
