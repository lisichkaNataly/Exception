public class Main {
    public static void main(String[] args) {

        try {
            ThrowDemo.demo();
        }
        catch (NullPointerException e){
            System.out.println("повторный перехват исключения: " + e);
        }
        System.out.println("работа программы завершена");

}
}
