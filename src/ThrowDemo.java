public class ThrowDemo {

    static void demo(){
        try {
            NullPointerException exception = new NullPointerException("ошибка");
            throw exception;
        }
        catch (NullPointerException e){
            System.out.println("перехват исключения в методе demo");
            throw e;
        }
    }
}
