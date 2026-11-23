public class App {
    public static void main(String[] args) throws Exception {
        GenericClass genericObj = new GenericClass();

        //  Stampa con metodo generico di tipo String
        genericObj.<String>print("Questa è una stringa!");
        //  Stampa con metodo generico di tipo Integer
        genericObj.<Integer>print(12345);

    }
}
