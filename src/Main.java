public class Main {
    public static void main(String[] args) {

        try {
            ThrowDemo.demo();
        }
        catch (NullPointerException e){
            System.out.println("Повторный перехват исключения: " + e);
        }
        System.out.println("Работа программы завершена");

}
}
