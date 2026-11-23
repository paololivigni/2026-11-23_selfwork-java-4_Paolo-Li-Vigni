public class App {
    public static void main(String[] args) throws Exception {

        GenericClass<String, Integer> agent007 = new  GenericClass<String,Integer>("James Bond", 007);
        System.out.println("Il mio nome è " + agent007.getArgT1() + " e mi identificano come agente " + agent007.getArgT2());

    }
}
